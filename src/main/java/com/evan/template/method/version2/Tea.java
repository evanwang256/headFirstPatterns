package com.evan.template.method.version2;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public class Tea extends CaffeineBeverage {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void steepTeaBag() {
        System.out.println("steeping the tea");
    }

    public void addLemon() {
        System.out.println("adding lemon");
    }
}
