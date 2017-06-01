package com.evan.pattern.strategy.version4;

/**
 * Created by wangzhen318 on 2017/4/13.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        //实现鸭子的飞行动作
        System.out.println("I'm flying!!");
    }
}
