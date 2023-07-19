package net.batty.battystuff.item;

import net.batty.battystuff.BattyStuff;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BATTY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BattyStuff.MOD_ID,
            "batty"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.batty"))
                    .icon(() -> new ItemStack(ModItems.SYRINGE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BLOOD);
                        entries.add(ModItems.SYRINGE);

                    }).build());

    public static void registerItemGroups(){
        BattyStuff.LOGGER.info("Registering Item Groups for " + BattyStuff.MOD_ID);
    }
}
