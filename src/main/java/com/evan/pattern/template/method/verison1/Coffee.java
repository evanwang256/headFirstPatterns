package com.evan.pattern.template.method.verison1;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("dripping coffee through filter");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("adding sugar and milk");
    }
}
