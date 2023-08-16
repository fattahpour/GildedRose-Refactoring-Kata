package com.gildedrose.refactoring.pattern.strategy.items;

public class NormalItemStrategy extends Item {
    public NormalItemStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellIn();
        decreaseQuality();
        if (getSellIn() < 0) {
            decreaseQuality();
        }
    }
}
