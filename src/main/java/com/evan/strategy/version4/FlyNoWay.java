package com.evan.strategy.version4;

/**
 * Created by wangzhen318 on 2017/4/13.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //什么都不做，不会飞
        System.out.println("I can't fly");
    }
}
