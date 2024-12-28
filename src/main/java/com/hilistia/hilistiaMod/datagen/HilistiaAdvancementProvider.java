package com.hilistia.hilistiaMod.datagen;

import com.hilistia.hilistiaMod.HilistiaMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class HilistiaAdvancementProvider extends FabricAdvancementProvider {
    protected HilistiaAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement.Builder.create()
                .display(
                        Items.DIRT,
                        Text.literal("Your first dirt block"),
                        Text.literal("get some dirt"),
                        new Identifier("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_dirt", InventoryChangedCriterion.Conditions.items(Items.DIRT))
                .build(consumer, HilistiaMod.MOD_ID + "/root");
    }
}
