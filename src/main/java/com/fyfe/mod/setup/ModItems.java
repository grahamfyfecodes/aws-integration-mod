package com.fyfe.mod.setup;

import com.fyfe.mod.item.HttpItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> HTTP_ITEM = Registration.ITEMS.register("http_item", HttpItem::new);

    static void register() {}
}
