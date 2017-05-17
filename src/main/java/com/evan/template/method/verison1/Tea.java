package com.evan.template.method.verison1;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void steepTeaBag() {
        System.out.println("steeping the tea");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    public void addLemon() {
        System.out.println("adding lemon");
    }
}
