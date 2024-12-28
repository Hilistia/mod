package com.hilistia.hilistiaMod;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Objects;

public class EventManager {

    public static void RegisterEvents() {

        // register player death handler
        ServerLivingEntityEvents.AFTER_DEATH.register((entity, source) -> {
            if (entity.isPlayer() && Objects.requireNonNull(source.getAttacker()).isPlayer()) {
                // pvp kill handling
                onPvpKill((PlayerEntity) entity, (PlayerEntity) source.getAttacker());
            }
        });

    }

    public static void onPvpKill(PlayerEntity target, PlayerEntity source) {
        PlayerCharacter killer = new PlayerCharacter(source);
        killer.onPlayerKill();
    }
}
