package com.evan.pattern.decorator.version2;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

