package com.evan.pattern.factory.version1;

/**
 * Created by wangzhen318 on 2017/5/27.
 */
public class PizzaStore3 {
    /**
     * 又需要更多的披萨类型...
     * 希腊比萨卖的不好，需要去掉
     */
    Pizza orderPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
            // } else if (type.equals("greek")) {
            //     pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        //新增的披萨类型
        else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
