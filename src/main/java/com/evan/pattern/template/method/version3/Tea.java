package com.evan.pattern.template.method.version3;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    public void brew() {
        System.out.println("steeping the tea");
    }
}
