package com.evan.pattern.decorator.version3.size;


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
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            return cost + .10;
        } else if (getSize() == Beverage.GRANDE) {
            return cost + .15;
        } else if (getSize() == Beverage.VENTI) {
            return cost + .20;
        }
        return cost;
    }
}
