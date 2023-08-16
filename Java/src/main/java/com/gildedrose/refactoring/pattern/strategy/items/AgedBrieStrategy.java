package com.gildedrose.refactoring.pattern.strategy.items;


public class AgedBrieStrategy extends Item {
    public AgedBrieStrategy(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellIn();
        increaseQuality();
    }
}
