package com.evan.pattern.decorator.version1;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public class Espresso extends Beverage{
    @Override
    public double cost() {
        return 1.99 + super.cost();
    }
}
