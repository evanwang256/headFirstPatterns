package com.evan.pattern.decorator.version1;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99 + super.cost();
    }
}
