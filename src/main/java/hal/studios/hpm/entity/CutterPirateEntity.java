
package hal.studios.hpm.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import hal.studios.hpm.procedures.CutterPirateEntityDiesProcedure;
import hal.studios.hpm.procedures.CutterOnEntityTickUpdateProcedure;
import hal.studios.hpm.init.HpmModEntities;

public class CutterPirateEntity extends PathfinderMob implements RangedAttackMob {
	public CutterPirateEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HpmModEntities.CUTTER_PIRATE.get(), world);
	}

	public CutterPirateEntity(EntityType<CutterPirateEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (CutterPirateEntity.this.isInWater())
					CutterPirateEntity.this.setDeltaMovement(CutterPirateEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !CutterPirateEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - CutterPirateEntity.this.getX();
					double dy = this.wantedY - CutterPirateEntity.this.getY();
					double dz = this.wantedZ - CutterPirateEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * CutterPirateEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					CutterPirateEntity.this.setYRot(this.rotlerp(CutterPirateEntity.this.getYRot(), f, 10));
					CutterPirateEntity.this.yBodyRot = CutterPirateEntity.this.getYRot();
					CutterPirateEntity.this.yHeadRot = CutterPirateEntity.this.getYRot();
					if (CutterPirateEntity.this.isInWater()) {
						CutterPirateEntity.this.setSpeed((float) CutterPirateEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						CutterPirateEntity.this.setXRot(this.rotlerp(CutterPirateEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(CutterPirateEntity.this.getXRot() * (float) (Math.PI / 180.0));
						CutterPirateEntity.this.setZza(f3 * f1);
						CutterPirateEntity.this.setYya((float) (f1 * dy));
					} else {
						CutterPirateEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					CutterPirateEntity.this.setSpeed(0);
					CutterPirateEntity.this.setYya(0);
					CutterPirateEntity.this.setZza(0);
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
		this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 2, 40));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, CutterEntity.class, true, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, SwashbucklerupgradedEntity.class, true, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, SwashbucklerEntity.class, true, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, RaftEntity.class, true, false));
		this.targetSelector.addGoal(6, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getPassengersRidingOffset() {
		return super.getPassengersRidingOffset() + -1.9;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), 0.15f, 1);
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
		CutterPirateEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CutterOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		HandCannonEntity.shoot(this, target);
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

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 100);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 128);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.5);
		return builder;
	}
}
