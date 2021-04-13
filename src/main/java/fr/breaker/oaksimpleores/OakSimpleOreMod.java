package fr.breaker.oaksimpleores;

import fr.breaker.oaksimpleores.init.ModBlock;
import fr.breaker.oaksimpleores.init.ModItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OakSimpleOreMod implements ModInitializer
{
    public static final String MODID = "oaksimpleores";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier("oaksimpleores", "oaksimpleores"))
            .icon(() -> new ItemStack(ModItem.PURPI_SWORD))
            .appendItems(stacks ->
            {
                stacks.add(new ItemStack(ModItem.GREESHIS_DUST));
                stacks.add(new ItemStack(ModBlock.GREESHIS_BLOCK));
                stacks.add(new ItemStack(ModBlock.GREESHIS_ORE));
                stacks.add(new ItemStack(ModItem.PURPI_INGOT));
                stacks.add(new ItemStack(ModBlock.PURPI_BLOCK));
                stacks.add(new ItemStack(ModBlock.PURPI_ORE));
                stacks.add(new ItemStack(ModItem.PURPI_SWORD));
                stacks.add(new ItemStack(ModItem.PURPI_PICKAXE));
                stacks.add(new ItemStack(ModItem.PURPI_AXE));
                stacks.add(new ItemStack(ModItem.PURPI_SHOVEL));
                stacks.add(new ItemStack(ModItem.PURPI_HOE));
                stacks.add(new ItemStack(ModItem.PURPI_HELMET));
                stacks.add(new ItemStack(ModItem.PURPI_CHESTPLATE));
                stacks.add(new ItemStack(ModItem.PURPI_LEGGINGS));
                stacks.add(new ItemStack(ModItem.PURPI_BOOTS));
            })
            .build();

    private static ConfiguredFeature<?, ?> ORE_PURPI_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlock.PURPI_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    private static ConfiguredFeature<?, ?> ORE_GREESHIS_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlock.GREESHIS_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    @Override
    public void onInitialize()
    {
        ModItem.registerAll();
        ModBlock.INSTANCE.registerAll();


        RegistryKey<ConfiguredFeature<?, ?>> orePurpiOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("oaksimpleores", "ore_purpi_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePurpiOverworld.getValue(), ORE_PURPI_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePurpiOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreGreeshisOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("oaksimpleores", "ore_greeshis_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreGreeshisOverworld.getValue(), ORE_GREESHIS_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreGreeshisOverworld);
    }
}
