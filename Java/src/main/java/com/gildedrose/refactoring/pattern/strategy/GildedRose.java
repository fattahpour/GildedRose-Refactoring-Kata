package com.gildedrose.refactoring.pattern.strategy;


import com.gildedrose.refactoring.pattern.strategy.items.Item;

import java.util.Arrays;
import java.util.List;

public class GildedRose {
    private final List<Item> items;

    public GildedRose(Item[] items) {
        this.items = Arrays.asList(items);
    }
    public void updateQuality() {
        items.forEach(Item::update);
    }
}
