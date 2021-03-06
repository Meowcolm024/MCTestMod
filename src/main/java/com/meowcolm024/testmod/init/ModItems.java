package com.meowcolm024.testmod.init;

import com.meowcolm024.testmod.items.ItemBase;
import com.meowcolm024.testmod.items.food.FoodBase;
import com.meowcolm024.testmod.items.food.FoodEffectBase;
import com.meowcolm024.testmod.items.tools.*;
import com.meowcolm024.testmod.moddedsrc.ModBow;
import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 233, 12.0F, 4.0F, 10);
    public static final Item.ToolMaterial MATERIAL_EXCALIBUR = EnumHelper.addToolMaterial("material_excalibur", 3, 32768, 16.0F, 128.0F, 16);

    // Items
    public static final Item RUBY = new ItemBase("ruby");
    public static final Item PYTHON = new Python("python");

    // Tools
    public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
    public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
    public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
    public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
    public static final ModBow RUBY_BOW = new ToolBow("ruby_bow");
    public static final ItemSword EXCALIBUR = new Excalibur("excalibur", MATERIAL_EXCALIBUR);

    // Food
    public static final ItemFood EVIL_APPLE = new FoodBase("evil_apple", 8, 2.8f, false);
    public static final ItemFood STRANGE_APPLE = new FoodEffectBase("strange_apple", 10, 3.4f, false, new PotionEffect(MobEffects.HUNGER, (60*20), 1, false, true));
    public static final ItemFood LIFT_BANANA = new FoodEffectBase("lift_banana", 6, 1.8f, false, new PotionEffect(MobEffects.LEVITATION, (120*20), 1, false, true));

}
