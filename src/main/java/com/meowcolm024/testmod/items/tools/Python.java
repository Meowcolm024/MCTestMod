package com.meowcolm024.testmod.items.tools;

import com.meowcolm024.testmod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Python extends ItemBase {
    public Python(String name) {
        super(name);
    }
    /*
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d aim = playerIn.getLookVec();
        EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);
        fireball.setPosition(playerIn.posX + aim.x *1.5D, playerIn.posY + aim.y *1.5D, playerIn.posZ * 1.5D);
        fireball.accelerationX = aim.x * 0.1;
        fireball.accelerationY = aim.y * 0.1;
        fireball.accelerationZ = aim.z * 0.1;
        worldIn.spawnEntity(fireball);
        item.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);

    }*/

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
            EntityEgg entityegg = new EntityEgg(worldIn, playerIn);
            entityegg.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entityegg);
        }

        //playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
}

