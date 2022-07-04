package net.bodewilson.bleachmod.item;

import net.bodewilson.bleachmod.BleachMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item REIRYOKU = registerItem("reiryoku", new Item(
            new FabricItemSettings().group(ModItemGroup.BLEACHMOD)));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(BleachMod.MOD_ID, name), item);
    }

    public static  void registerModItems()
    {
        BleachMod.LOGGER.debug("Registering Mod Items for " + BleachMod.MOD_ID);
    }
}
