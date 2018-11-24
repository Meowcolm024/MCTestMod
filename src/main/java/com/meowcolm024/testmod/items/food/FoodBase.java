package com.meowcolm024.testmod.items.food;

import com.meowcolm024.testmod.Main;
import com.meowcolm024.testmod.init.ModItems;
import com.meowcolm024.testmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
