package com.gildedrose.refactoring.pattern.strategy.items;

public class ConjuredItemStrategy extends Item {
    public ConjuredItemStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellIn();
        decreaseQuality2X();
        if (getSellIn() < 0) {
            decreaseQuality2X();
        }
    }
}
