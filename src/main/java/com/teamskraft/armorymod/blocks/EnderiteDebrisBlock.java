package com.teamskraft.armorymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EnderiteDebrisBlock extends Block {
    public EnderiteDebrisBlock() {
        super(Properties.create(Material.PISTON)
                .hardnessAndResistance(6.0f,30.0f)
                .sound(SoundType.WOOD)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
