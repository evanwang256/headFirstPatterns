package com.evan.template.method.version2;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public abstract class CaffeineBeverage {
    abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }
}
