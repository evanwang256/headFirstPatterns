package com.evan.decorator.version2;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

