package com.evan.pattern.strategy.version4;

/**
 * Created by wangzhen318 on 2017/4/12.
 */
public class MallardDuck extends Duck  {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
