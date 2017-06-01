package com.evan.pattern.decorator.version3.size;


/**
 * Created by wangzhen318 on 2017/5/16.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    public abstract int getSize();
}
