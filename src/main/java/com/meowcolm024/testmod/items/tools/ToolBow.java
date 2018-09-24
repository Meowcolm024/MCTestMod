package com.meowcolm024.testmod.items.tools;

import com.meowcolm024.testmod.Main;
import com.meowcolm024.testmod.init.ModItems;
import com.meowcolm024.testmod.moddedsrc.ModBow;
import com.meowcolm024.testmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;

public class ToolBow extends ModBow implements IHasModel {

    public ToolBow(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
