package net.mcreator.abbysal_voids;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@Elementsabbysal_voids.ModElement.Tag
public class MCreatorLeaves extends Elementsabbysal_voids.ModElement {
	@GameRegistry.ObjectHolder("abbysal_voids:leaves")
	public static final Block block = null;

	public MCreatorLeaves(Elementsabbysal_voids instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("abbysal_voids:leaves", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.LEAVES);
			setRegistryName("leaves");
			setUnlocalizedName("leaves");
			setSoundType(SoundType.GROUND);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(MCreatorAbyssalVoid.tab);
		}
	}
}
