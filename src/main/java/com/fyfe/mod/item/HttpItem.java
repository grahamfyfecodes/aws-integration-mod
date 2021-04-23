package com.fyfe.mod.item;

import com.fyfe.mod.http.AWSHttpRequest;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class HttpItem extends Item {

    public HttpItem() {
        super(new Item.Properties().tab(ItemGroup.TAB_MISC));
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        System.out.println("Used twice on one right click");
        AWSHttpRequest.wah();
        return super.use(world, player, hand);
    }
}
