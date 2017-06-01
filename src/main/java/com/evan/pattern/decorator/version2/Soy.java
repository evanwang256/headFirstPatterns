package com.evan.pattern.decorator.version2;

/**
 * 豆浆.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        CupSize size = CupSize.getBySize(getSize());
        double coffeeCost = beverage.cost();
        switch (size) {
            case LITTLE:
                return 0.1 + coffeeCost;
            case MIDDLE:
                return 0.15 + coffeeCost;
            case BIG:
                return 0.2 + coffeeCost;
        }
        throw new RuntimeException();
    }
}
