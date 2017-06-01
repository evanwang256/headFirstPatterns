package com.evan.pattern.factory.version1;

/**
 * Created by wangzhen318 on 2017/5/27.
 */
public class PizzaStore {
    Pizza orderPizza() {
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
