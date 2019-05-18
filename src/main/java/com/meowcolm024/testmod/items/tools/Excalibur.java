package com.meowcolm024.testmod.items.tools;

import com.meowcolm024.testmod.Main;
import com.meowcolm024.testmod.init.ModItems;
import com.meowcolm024.testmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

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
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d aim = playerIn.getLookVec();
        worldIn.createExplosion(playerIn, playerIn.posX + aim.x*15D, playerIn.posY + aim.y*10D, playerIn.posZ + aim.z*15D, 64.0F, false);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);

    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
