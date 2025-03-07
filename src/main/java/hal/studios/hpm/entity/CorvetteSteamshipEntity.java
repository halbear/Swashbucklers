
package hal.studios.hpm.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.Nullable;

import hal.studios.hpm.procedures.IDZeroCheckProcedure;
import hal.studios.hpm.procedures.CorvettedamagedspawnProcedure;
import hal.studios.hpm.procedures.CorvetteSteamshipOnInitialEntitySpawnProcedure;
import hal.studios.hpm.procedures.CorvetteSteamshipOnEntityTickUpdateProcedure;
import hal.studios.hpm.init.HpmModEntities;

public class CorvetteSteamshipEntity extends PathfinderMob {
	public CorvetteSteamshipEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HpmModEntities.CORVETTE_STEAMSHIP.get(), world);
	}

	public CorvetteSteamshipEntity(EntityType<CorvetteSteamshipEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (CorvetteSteamshipEntity.this.isInWater())
					CorvetteSteamshipEntity.this.setDeltaMovement(CorvetteSteamshipEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !CorvetteSteamshipEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - CorvetteSteamshipEntity.this.getX();
					double dy = this.wantedY - CorvetteSteamshipEntity.this.getY();
					double dz = this.wantedZ - CorvetteSteamshipEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * CorvetteSteamshipEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					CorvetteSteamshipEntity.this.setYRot(this.rotlerp(CorvetteSteamshipEntity.this.getYRot(), f, 10));
					CorvetteSteamshipEntity.this.yBodyRot = CorvetteSteamshipEntity.this.getYRot();
					CorvetteSteamshipEntity.this.yHeadRot = CorvetteSteamshipEntity.this.getYRot();
					if (CorvetteSteamshipEntity.this.isInWater()) {
						CorvetteSteamshipEntity.this.setSpeed((float) CorvetteSteamshipEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						CorvetteSteamshipEntity.this.setXRot(this.rotlerp(CorvetteSteamshipEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(CorvetteSteamshipEntity.this.getXRot() * (float) (Math.PI / 180.0));
						CorvetteSteamshipEntity.this.setZza(f3 * f1);
						CorvetteSteamshipEntity.this.setYya((float) (f1 * dy));
					} else {
						CorvetteSteamshipEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					CorvetteSteamshipEntity.this.setSpeed(0);
					CorvetteSteamshipEntity.this.setYya(0);
					CorvetteSteamshipEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.attack_wooden_door"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		CorvettedamagedspawnProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		CorvetteSteamshipOnInitialEntitySpawnProcedure.execute(world, this);
		return retval;
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		super.mobInteract(sourceentity, hand);
		sourceentity.startRiding(this);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		IDZeroCheckProcedure.execute(world, entity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CorvetteSteamshipOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	@Override
	public boolean canCollideWith(Entity entity) {
		return true;
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.1);
		builder = builder.add(Attributes.MAX_HEALTH, 350);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 8);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.1);
		return builder;
	}
}
