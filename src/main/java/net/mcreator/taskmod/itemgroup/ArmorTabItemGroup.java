
package net.mcreator.taskmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.taskmod.item.ClothesArmorItem;
import net.mcreator.taskmod.TaskmodModElements;

@TaskmodModElements.ModElement.Tag
public class ArmorTabItemGroup extends TaskmodModElements.ModElement {
	public ArmorTabItemGroup(TaskmodModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarmor_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ClothesArmorItem.helmet, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
