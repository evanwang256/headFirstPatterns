package com.evan.pattern.decorator.version1;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public class HouseBlend extends Beverage{

    @Override
    public double cost() {
        return 0.89 + super.cost();
    }
}
