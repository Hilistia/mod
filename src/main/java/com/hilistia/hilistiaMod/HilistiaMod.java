package com.hilistia.hilistiaMod;

import net.fabricmc.api.ModInitializer;

public class HilistiaMod implements ModInitializer {

    @Override
    public void onInitialize() {

        // register all Hilistia events
        EventManager.RegisterEvents();
    }
}
