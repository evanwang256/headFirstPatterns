package com.evan.strategy.version2;

/**
 * Created by wangzhen318 on 2017/4/12.
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        //诱饵鸭
    }

    @Override
    public void fly() {
        //不会飞
    }

    @Override
    public void quack() {
        //不会叫
    }
}
