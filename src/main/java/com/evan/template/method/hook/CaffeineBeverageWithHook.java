package com.evan.template.method.hook;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
        return true;
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
