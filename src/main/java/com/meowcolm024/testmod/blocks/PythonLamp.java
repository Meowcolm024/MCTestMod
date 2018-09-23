package com.meowcolm024.testmod.blocks;

import com.meowcolm024.testmod.Main;
import com.meowcolm024.testmod.init.ModBlocks;
import com.meowcolm024.testmod.init.ModItems;
import com.meowcolm024.testmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PythonLamp extends Block implements IHasModel {

    public PythonLamp(String name, Material material) {
        super(material);

        setSoundType(SoundType.GLASS);
        setHardness(1.5F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(1.0F);
        setLightOpacity(5);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.DECORATIONS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
