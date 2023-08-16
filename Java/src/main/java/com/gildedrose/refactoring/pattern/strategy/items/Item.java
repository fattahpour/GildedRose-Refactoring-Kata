package com.gildedrose.refactoring.pattern.strategy.items;

public abstract class Item {
    private final String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void update();

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    protected void decreaseSellIn() {
        setSellIn(getSellIn() - 1);
    }

    protected void increaseQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }
    protected void increaseQuality2X() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 2);
        }
    }
    protected void decreaseQuality() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }
    protected void decreaseQuality2X() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 2);
        }
    }
}
