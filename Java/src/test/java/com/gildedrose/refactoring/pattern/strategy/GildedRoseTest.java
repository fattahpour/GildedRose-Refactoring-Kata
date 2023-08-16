package com.gildedrose.refactoring.pattern.strategy;

import com.gildedrose.refactoring.pattern.strategy.items.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GildedRoseTest {

    private Item[] items;
    private GildedRose app;

    @BeforeEach
    public  void setUp() {
        items = new Item[] {
            new NormalItemStrategy("+5 Dexterity Vest", 10, 20),
            new AgedBrieStrategy(2, 0),
            new NormalItemStrategy("Elixir of the Mongoose", 5, 7),
            new SulfurasStrategy(0),
            new SulfurasStrategy(-1),
            new BackstagePassStrategy(15, 20),
            new BackstagePassStrategy(10, 49),
            new BackstagePassStrategy(5, 49),
            new ConjuredItemStrategy("Conjured Mana Cake", 3, 6)
        };
        app = new GildedRose(items);
    }

    @Test
    public void testUpdateQualityAfterOneDay() {
        app.updateQuality();

        assertEquals(19, items[0].getQuality());
        assertEquals(9, items[0].getSellIn());

        assertEquals(1, items[1].getQuality());
        assertEquals(1, items[1].getSellIn());

        assertEquals(6, items[2].getQuality());
        assertEquals(4, items[2].getSellIn());

        assertEquals(80, items[3].getQuality());
        assertEquals(0, items[3].getSellIn()); // Sulfuras sellIn doesn't change

        assertEquals(80, items[4].getQuality());
        assertEquals(-1, items[4].getSellIn()); // Sulfuras sellIn doesn't change

        assertEquals(21, items[5].getQuality());
        assertEquals(14, items[5].getSellIn());

        assertEquals(50, items[6].getQuality());
        assertEquals(9, items[6].getSellIn());

        assertEquals(50, items[7].getQuality());
        assertEquals(4, items[7].getSellIn());

        assertEquals(4, items[8].getQuality());
        assertEquals(2, items[8].getSellIn());
    }

    @Test
    public void testUpdateQualityAfterTwoDays() {
        app.updateQuality();
        app.updateQuality();

        assertEquals(18, items[0].getQuality());
        assertEquals(8, items[0].getSellIn());

        assertEquals(2, items[1].getQuality());
        assertEquals(0, items[1].getSellIn());

        assertEquals(5, items[2].getQuality());
        assertEquals(3, items[2].getSellIn());
        // Sulfuras
        assertEquals(80, items[3].getQuality());
        assertEquals(0, items[3].getSellIn());

        //Sulfuras
        assertEquals(80, items[4].getQuality());
        assertEquals(-1, items[4].getSellIn());

        assertEquals(22, items[5].getQuality());
        assertEquals(13, items[5].getSellIn());

        assertEquals(50, items[6].getQuality());
        assertEquals(8, items[6].getSellIn());

        assertEquals(50, items[7].getQuality());
        assertEquals(3, items[7].getSellIn());
        // Conjured
        assertEquals(2, items[8].getQuality());
        assertEquals(1, items[8].getSellIn());
    }
}

