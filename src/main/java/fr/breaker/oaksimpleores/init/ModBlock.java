package fr.breaker.oaksimpleores.init;


import fr.breaker.oaksimpleores.OakSimpleOreMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock
{
    public static final ModBlock INSTANCE = new ModBlock();

    public static final Block PURPI_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 15f));
    public static final Block GREESHIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 15f));

    public static final Block PURPI_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 10f));
    public static final Block GREESHIS_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 10f));

    public void registerAll()
    {
        register(PURPI_ORE, new Identifier(OakSimpleOreMod.MODID, "purpi_ore"));
        register(PURPI_BLOCK, new Identifier(OakSimpleOreMod.MODID, "purpi_block"));
        register(GREESHIS_BLOCK, new Identifier(OakSimpleOreMod.MODID, "greeshis_block"));
        register(GREESHIS_ORE, new Identifier(OakSimpleOreMod.MODID, "greeshis_ore"));
    }

    private void register(Block block, Identifier name)
    {
        Registry.register(Registry.BLOCK, name, block);
        createBlockItem(block, name);
    }

    private void createBlockItem(Block block, Identifier name)
    {
        Registry.register(Registry.ITEM, name, new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
