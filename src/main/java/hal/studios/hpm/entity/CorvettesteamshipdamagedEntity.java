
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

import hal.studios.hpm.procedures.CorvetteSteamshipOnInitialEntitySpawnProcedure;
import hal.studios.hpm.procedures.CorvetteSteamshipOnEntityTickUpdateProcedure;
import hal.studios.hpm.init.HpmModEntities;

public class CorvettesteamshipdamagedEntity extends PathfinderMob {
	public CorvettesteamshipdamagedEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HpmModEntities.CORVETTESTEAMSHIPDAMAGED.get(), world);
	}

	public CorvettesteamshipdamagedEntity(EntityType<CorvettesteamshipdamagedEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (CorvettesteamshipdamagedEntity.this.isInWater())
					CorvettesteamshipdamagedEntity.this.setDeltaMovement(CorvettesteamshipdamagedEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !CorvettesteamshipdamagedEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - CorvettesteamshipdamagedEntity.this.getX();
					double dy = this.wantedY - CorvettesteamshipdamagedEntity.this.getY();
					double dz = this.wantedZ - CorvettesteamshipdamagedEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * CorvettesteamshipdamagedEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					CorvettesteamshipdamagedEntity.this.setYRot(this.rotlerp(CorvettesteamshipdamagedEntity.this.getYRot(), f, 10));
					CorvettesteamshipdamagedEntity.this.yBodyRot = CorvettesteamshipdamagedEntity.this.getYRot();
					CorvettesteamshipdamagedEntity.this.yHeadRot = CorvettesteamshipdamagedEntity.this.getYRot();
					if (CorvettesteamshipdamagedEntity.this.isInWater()) {
						CorvettesteamshipdamagedEntity.this.setSpeed((float) CorvettesteamshipdamagedEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						CorvettesteamshipdamagedEntity.this.setXRot(this.rotlerp(CorvettesteamshipdamagedEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(CorvettesteamshipdamagedEntity.this.getXRot() * (float) (Math.PI / 180.0));
						CorvettesteamshipdamagedEntity.this.setZza(f3 * f1);
						CorvettesteamshipdamagedEntity.this.setYya((float) (f1 * dy));
					} else {
						CorvettesteamshipdamagedEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					CorvettesteamshipdamagedEntity.this.setSpeed(0);
					CorvettesteamshipdamagedEntity.this.setYya(0);
					CorvettesteamshipdamagedEntity.this.setZza(0);
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
		if (source.getDirectEntity() instanceof Player)
			return false;
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
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		CorvetteSteamshipOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		super.mobInteract(sourceentity, hand);
		sourceentity.startRiding(this);
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
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.1);
		return builder;
	}
}
