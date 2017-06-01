package com.evan.pattern.decorator.version3.size;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        // TODO: 2017/5/17 do something with size
        return 0.1 + beverage.cost();
    }
}
