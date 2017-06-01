package com.evan.pattern.template.method.version3;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void addCondiments();

    public abstract void brew();

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }
}
