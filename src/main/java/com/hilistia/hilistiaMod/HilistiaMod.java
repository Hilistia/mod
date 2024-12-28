package com.hilistia.hilistiaMod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HilistiaMod implements ModInitializer {

    public static final String MOD_ID = "hilistiamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("initializing hilistia mod");
    }
}
