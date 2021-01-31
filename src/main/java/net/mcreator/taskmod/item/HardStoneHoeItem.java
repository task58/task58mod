
package net.mcreator.taskmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.taskmod.itemgroup.ToolsTabItemGroup;
import net.mcreator.taskmod.block.HardStoneBlock;
import net.mcreator.taskmod.TaskmodModElements;

@TaskmodModElements.ModElement.Tag
public class HardStoneHoeItem extends TaskmodModElements.ModElement {
	@ObjectHolder("taskmod:hard_stone_hoe")
	public static final Item block = null;
	public HardStoneHoeItem(TaskmodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 164;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HardStoneBlock.block, (int) (1)), new ItemStack(HardStonePiecesItem.block, (int) (1)));
			}
		}, -2.7999999999999998f, new Item.Properties().group(ToolsTabItemGroup.tab)) {
		}.setRegistryName("hard_stone_hoe"));
	}
}
