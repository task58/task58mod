
package net.mcreator.taskmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.taskmod.itemgroup.ToolsTabItemGroup;
import net.mcreator.taskmod.block.HardStoneBlock;
import net.mcreator.taskmod.TaskmodModElements;

@TaskmodModElements.ModElement.Tag
public class HardStoneAxeItem extends TaskmodModElements.ModElement {
	@ObjectHolder("taskmod:hard_stone_axe")
	public static final Item block = null;
	public HardStoneAxeItem(TaskmodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HardStoneBlock.block, (int) (1)), new ItemStack(HardStonePiecesItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ToolsTabItemGroup.tab)) {
		}.setRegistryName("hard_stone_axe"));
	}
}
