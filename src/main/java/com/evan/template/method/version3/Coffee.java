package com.evan.template.method.version3;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    public void brew() {
        System.out.println("dripping coffee through filter");
    }
}
