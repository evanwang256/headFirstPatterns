package com.evan.pattern.decorator.version3.size;


/**
 * Created by wangzhen318 on 2017/5/16.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
