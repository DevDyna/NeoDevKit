package com.devdyna.modname_id.datagen.server.tables;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.devdyna.modname_id.init.types.Blocks;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

public class BlockDrop extends BlockLootSubProvider {

        public BlockDrop(HolderLookup.Provider l) {
                super(Set.of(), FeatureFlags.DEFAULT_FLAGS, l);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
                List<Block> blocks = getList(Blocks.zBlock.getEntries());
                blocks.addAll(getList(Blocks.zBlockItem.getEntries()));
                return blocks;
        }

        private List<Block> getList(Collection<DeferredHolder<Block, ? extends Block>> c) {
                return c.stream().map(e -> (Block) e.value()).toList();
        }

        @Override
        protected void generate() {
                // dropSelf(Blocks.BK.get());

                // Blocks.zBlock.getEntries().forEach(b -> dropSelf(b.get()));

        }

}
