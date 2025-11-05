package org.mod.submit_mod.Init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.mod.submit_mod.Submit_mod;

public class ItemInit {


    public static final Item REG_ITEM = register("reg_item", new Item(new Item.Settings()));

    public static <T extends Item>T register(String name, T item) {
        return Registry.register(Registries.ITEM, Submit_mod.id(name), item);
    }

    public static void load(){}


}
