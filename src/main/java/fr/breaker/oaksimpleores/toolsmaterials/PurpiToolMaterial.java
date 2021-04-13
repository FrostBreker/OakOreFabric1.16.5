package fr.breaker.oaksimpleores.toolsmaterials;

import fr.breaker.oaksimpleores.init.ModItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PurpiToolMaterial implements ToolMaterial
{
    public static final PurpiToolMaterial INSTANCE = new PurpiToolMaterial();

    @Override
    public int getDurability() {
        return 2380;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 16f;
    }

    @Override
    public float getAttackDamage() {
        return 8f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 70;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItem.PURPI_INGOT);
    }
}
