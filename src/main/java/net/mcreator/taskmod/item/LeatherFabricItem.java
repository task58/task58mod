
package net.mcreator.taskmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.taskmod.itemgroup.ItemsTabItemGroup;
import net.mcreator.taskmod.TaskmodModElements;

@TaskmodModElements.ModElement.Tag
public class LeatherFabricItem extends TaskmodModElements.ModElement {
	@ObjectHolder("taskmod:leather_fabric")
	public static final Item block = null;
	public LeatherFabricItem(TaskmodModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemsTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("leather_fabric");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
