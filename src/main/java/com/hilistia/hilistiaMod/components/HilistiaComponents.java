package com.hilistia.hilistiaMod.components;

import com.hilistia.hilistiaMod.HilistiaMod;
import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.RespawnCopyStrategy;
import net.minecraft.util.Identifier;

public final class HilistiaComponents implements EntityComponentInitializer {
    public static final ComponentKey<IntComponent> STAIN = ComponentRegistryV3.INSTANCE.getOrCreate(Identifier.of(HilistiaMod.MOD_ID, "stain"), IntComponent.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(STAIN, PlayerStainComponent::new, RespawnCopyStrategy.ALWAYS_COPY);
    }
}
