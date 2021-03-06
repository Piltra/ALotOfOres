package net.minecraft.alotofores.blocks;

import net.minecraft.alotofores.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLeadOre extends Block{

	public BlockLeadOre(int i, Material rock) {
		super(rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeStone);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setBlockName("LeadOre");
		this.setHarvestLevel("pickaxe", 2); //0=wood,1=stone,2=iron,3=diamond
		this.setBlockTextureName(RefStrings.MODID + ":" + "LeadOre");
	}
	
}
