package fr.breaker.oaksimpleores.init;

import fr.breaker.oaksimpleores.OakSimpleOreMod;
import fr.breaker.oaksimpleores.armormaterials.PurpiArmorMaterial;
import fr.breaker.oaksimpleores.items.PurpiAxeItem;
import fr.breaker.oaksimpleores.items.PurpiHoeItem;
import fr.breaker.oaksimpleores.items.PurpiPickaxeItem;
import fr.breaker.oaksimpleores.items.PurpiShoveItem;
import fr.breaker.oaksimpleores.toolsmaterials.PurpiToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem
{
    public static final Item GREESHIS_DUST = new Item(new Item.Settings());
    public static final Item PURPI_INGOT = new Item(new Item.Settings());
    public static final Item PURPI_SWORD = new SwordItem(PurpiToolMaterial.INSTANCE, 2, -2.4f, new Item.Settings().maxCount(1));
    public static final Item PURPI_PICKAXE = new PurpiPickaxeItem(PurpiToolMaterial.INSTANCE, -1, -2.8f, new Item.Settings().maxCount(1));
    public static final Item PURPI_AXE = new PurpiAxeItem(PurpiToolMaterial.INSTANCE, 3, -3f, new Item.Settings().maxCount(1));
    public static final Item PURPI_SHOVEL = new PurpiShoveItem(PurpiToolMaterial.INSTANCE, -2, -3f, new Item.Settings().maxCount(1));
    public static final Item PURPI_HOE = new PurpiHoeItem(PurpiToolMaterial.INSTANCE, -3, -0f, new Item.Settings().maxCount(1));
    public static final Item PURPI_HELMET = new ArmorItem(PurpiArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item PURPI_CHESTPLATE = new ArmorItem(PurpiArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item PURPI_LEGGINGS = new ArmorItem(PurpiArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item PURPI_BOOTS = new ArmorItem(PurpiArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings());

    public static void registerAll()
    {
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "greeshis_dust"), GREESHIS_DUST);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_ingot"), PURPI_INGOT);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_sword"), PURPI_SWORD);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_pickaxe"), PURPI_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_axe"), PURPI_AXE);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_shovel"), PURPI_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_hoe"), PURPI_HOE);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_helmet"), PURPI_HELMET);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_chestplate"), PURPI_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_leggings"), PURPI_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(OakSimpleOreMod.MODID, "purpi_boots"), PURPI_BOOTS);
    }
}