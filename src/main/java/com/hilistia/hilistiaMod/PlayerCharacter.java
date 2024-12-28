package com.hilistia.hilistiaMod;

import com.hilistia.hilistiaMod.components.HilistiaComponents;
import net.minecraft.entity.Entity;

public class PlayerCharacter {

    private Entity player;

    public PlayerCharacter(Entity player) {
        this.player = player;
    }

    public void onPlayerKill() {
        // increase player stain
        int stain = this.player.getComponent(HilistiaComponents.STAIN).getValue() + 1;
        this.player.getComponent(HilistiaComponents.STAIN).setValue(stain);
    }
}
