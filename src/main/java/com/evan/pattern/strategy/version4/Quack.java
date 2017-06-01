package com.evan.pattern.strategy.version4;

/**
 * Created by wangzhen318 on 2017/4/13.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        //实现鸭子呱呱叫
        System.out.println("Quack");
    }
}
