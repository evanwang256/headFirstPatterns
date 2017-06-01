package com.evan.pattern.factory.version3;

/**
 * Created by wangzhen318 on 2017/5/27.
 */
public abstract class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
