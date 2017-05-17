package com.evan.decorator.version2;

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
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
