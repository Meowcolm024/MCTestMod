package com.meowcolm024.testmod.items.tools;

import com.meowcolm024.testmod.Main;
import com.meowcolm024.testmod.init.ModItems;
import com.meowcolm024.testmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Excalibur extends ItemSword implements IHasModel {

    public Excalibur(String name, ToolMaterial material) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        setMaxDamage(0);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
