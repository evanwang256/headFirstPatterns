package com.evan.strategy.version2;

/**
 * Created by wangzhen318 on 2017/4/12.
 */
public class RubberDuck extends Duck {
    @Override
    public void display() {
        //外观是橡皮鸭
    }

    /**
     * 不会呱呱叫
     */
    @Override
    public void quack() {
        //覆盖成吱吱叫
    }

    @Override
    public void fly() {
        //覆盖，什么事都不做
    }
}
