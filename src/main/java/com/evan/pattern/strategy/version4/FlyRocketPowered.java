package com.evan.pattern.strategy.version4;

/**
 * Created by wangzhen318 on 2017/4/13.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
