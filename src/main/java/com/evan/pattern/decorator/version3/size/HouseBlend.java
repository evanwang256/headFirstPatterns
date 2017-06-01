package com.evan.pattern.decorator.version3.size;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
