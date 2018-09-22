package com.meowcolm024.testmod.init;

import com.meowcolm024.testmod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
    public static final Block PYTHON_BLOCK = new BlockBase("python_block", Material.IRON);

}
