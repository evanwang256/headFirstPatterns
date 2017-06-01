package com.evan.pattern.strategy.version4;

/**
 * Created by wangzhen318 on 2017/4/13.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        //橡皮鸭子吱吱叫
        System.out.println("Squeak");
    }
}
