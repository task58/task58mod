
package net.mcreator.taskmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.taskmod.itemgroup.WeponsTabItemGroup;
import net.mcreator.taskmod.block.HardStoneBlock;
import net.mcreator.taskmod.TaskmodModElements;

@TaskmodModElements.ModElement.Tag
public class HardStoneSwordItem extends TaskmodModElements.ModElement {
	@ObjectHolder("taskmod:hard_stone_sword")
	public static final Item block = null;
	public HardStoneSwordItem(TaskmodModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 164;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 1.9999999999999996f;
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
		}, 3, -3f, new Item.Properties().group(WeponsTabItemGroup.tab)) {
		}.setRegistryName("hard_stone_sword"));
	}
}
