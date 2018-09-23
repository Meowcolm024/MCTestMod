package com.meowcolm024.testmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        // Smelting recipes
        GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(ModItems.RUBY, 9), 2.0f);
        GameRegistry.addSmelting(ModItems.PYTHON, new ItemStack(Items.DIAMOND, 3), 2233.0f);
    }
}
