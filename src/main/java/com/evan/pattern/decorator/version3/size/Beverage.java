package com.evan.pattern.decorator.version3.size;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    /**
     * 小杯
     */
    public static final int TALL = 1;
    /**
     * 中杯
     */
    public static final int GRANDE = 2;
    /**
     * 大杯
     */
    public static final int VENTI = 3;

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

