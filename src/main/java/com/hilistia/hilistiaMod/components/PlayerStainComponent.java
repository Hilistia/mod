package com.hilistia.hilistiaMod.components;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;

class PlayerStainComponent implements IntComponent, AutoSyncedComponent {

    private int stain = 0;
    private final Entity provider;

    public PlayerStainComponent(Entity provider) {
        this.provider = provider;
    }

    @Override
    public int getValue() {
        return this.stain;
    }

    public void setValue(int value) {
        this.stain = value;
        HilistiaComponents.STAIN.sync(this.provider);
    }

    @Override
    public void readFromNbt(NbtCompound tag) {
        this.stain = tag.getInt("stain");
    }

    @Override
    public void writeToNbt(NbtCompound tag) {
        tag.putInt("stain", this.stain);
    }
}
