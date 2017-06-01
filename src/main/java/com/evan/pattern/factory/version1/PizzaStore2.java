package com.evan.pattern.factory.version1;

/**
 * Created by wangzhen318 on 2017/5/27.
 */
public class PizzaStore2 {
    /**
     * 需要更多的披萨类型...
     */
    Pizza orderPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
