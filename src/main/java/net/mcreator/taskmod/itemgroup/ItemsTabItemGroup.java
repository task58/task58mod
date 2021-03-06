
package net.mcreator.taskmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.taskmod.item.HardStonePiecesItem;
import net.mcreator.taskmod.TaskmodModElements;

@TaskmodModElements.ModElement.Tag
public class ItemsTabItemGroup extends TaskmodModElements.ModElement {
	public ItemsTabItemGroup(TaskmodModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabitems_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HardStonePiecesItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
