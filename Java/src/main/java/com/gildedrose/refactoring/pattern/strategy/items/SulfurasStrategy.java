package com.gildedrose.refactoring.pattern.strategy.items;

public class SulfurasStrategy extends Item {
    public SulfurasStrategy(int sellIn) {
        super("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    @Override
    public void update() {
        // Not change :)!
    }
}
