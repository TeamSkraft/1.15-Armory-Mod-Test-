package com.teamskraft.armorymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EnderOreBlock extends Block {
    public EnderOreBlock() {
        super(Properties.create(Material.PISTON)
                .hardnessAndResistance(2.0f,3.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
