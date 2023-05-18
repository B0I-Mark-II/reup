package org.bukkit.scoreboard;

import org.bukkit.Statistic;
import org.bukkit.TestServer;
import org.bukkit.block.BlockType;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemType;
import org.junit.Assert;
import org.junit.Test;

public class CriteriaTest {

    @Test
    public void testStatistic() {
        TestServer.getInstance();

        Assert.assertThrows(IllegalArgumentException.class, () -> Criteria.statistic(Statistic.AVIATE_ONE_CM, BlockType.STONE)); // Generic statistic with block
        Assert.assertThrows(IllegalArgumentException.class, () -> Criteria.statistic(Statistic.AVIATE_ONE_CM, EntityType.CREEPER)); // Generic statistic with entity type

        Assert.assertThrows(IllegalArgumentException.class, () -> Criteria.statistic(Statistic.ENTITY_KILLED_BY, ItemType.AMETHYST_SHARD)); // Entity statistic with item type
        Assert.assertThrows(IllegalArgumentException.class, () -> Criteria.statistic(Statistic.MINE_BLOCK, ItemType.DIAMOND_PICKAXE)); // Block statistic with item
        Assert.assertThrows(IllegalArgumentException.class, () -> Criteria.statistic(Statistic.BREAK_ITEM, BlockType.WATER)); // Item statistic with block
        Assert.assertThrows(IllegalArgumentException.class, () -> Criteria.statistic(Statistic.KILL_ENTITY, BlockType.STONE)); // Entity statistic with block type
    }
}
