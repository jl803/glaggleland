package com.glagworld.glaggleland.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class GigglerEntity extends Animal {

    public GigglerEntity(EntityType<?> entityType, Level level) {
        super((EntityType<? extends Animal>) entityType, level);
    }


    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this,2.0));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this,1.0));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class,20.0f));

    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
    }


    @Override
    public boolean isFood(ItemStack itemStack) {
        return false;
    }
}
