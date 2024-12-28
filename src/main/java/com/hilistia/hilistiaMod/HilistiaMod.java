package com.hilistia.hilistiaMod;

import com.hilistia.hilistiaMod.components.HilistiaComponents;
import com.hilistia.hilistiaMod.components.IntComponent;
import eu.pb4.placeholders.api.PlaceholderResult;
import eu.pb4.placeholders.api.Placeholders;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class HilistiaMod implements ModInitializer {

    public static final String MOD_ID = "hilistiamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("Initializing Hilistia core mod");
        // register all Hilistia events
        EventManager.RegisterEvents();

        // register placeholders
        registerPlaceholders();
    }

    public void registerPlaceholders() {
        LOGGER.info("registering placeholders");
        Placeholders.register(
                new Identifier(MOD_ID, "stainscore"),
                (ctx, arg) -> {
                    UUID uuid = UUID.fromString(arg);
                    PlayerEntity player = ctx.server().getPlayerManager().getPlayer(uuid);
                    int stain = HilistiaComponents.STAIN.maybeGet(player).map(IntComponent::getValue).orElse(0);
                    return PlaceholderResult.value(Text.literal(String.valueOf(stain)));
                }
        );
    }
}
