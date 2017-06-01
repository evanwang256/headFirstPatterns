package com.evan.pattern.template.method.version2;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public class Coffee extends CaffeineBeverage{
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }


    public void brewCoffeeGrinds() {
        System.out.println("dripping coffee through filter");
    }

    public void addSugarAndMilk() {
        System.out.println("adding sugar and milk");
    }
}
