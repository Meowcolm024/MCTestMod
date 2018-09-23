package com.meowcolm024.testmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

    public RubyBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(2.5F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0.5F);
        //setLightOpacity(1);
        //setBlockUnbreakable();

    }
}
