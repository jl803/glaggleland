package com.glagworld.glaggleland.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class GigglerEntity extends Mob {

    public GigglerEntity(EntityType<?> entityType, Level level) {
        super((EntityType<? extends Mob>) entityType, level);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {

    }


}
