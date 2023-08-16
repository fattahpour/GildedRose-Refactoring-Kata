package com.gildedrose.refactoring.pattern.strategy.items;

public class BackstagePassStrategy extends Item {
    public BackstagePassStrategy(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellIn();
        increaseQuality();
        switch (getSellIn()) {
            case 0 -> setQuality(0);
            case 1, 2, 3, 4 -> increaseQuality2X();
            case 5, 6, 7, 8, 9 -> increaseQuality();
            default -> {}
        }
    }
}
