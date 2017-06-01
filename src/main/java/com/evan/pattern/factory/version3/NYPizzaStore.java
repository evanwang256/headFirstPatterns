package com.evan.pattern.factory.version3;

/**
 * Created by wangzhen318 on 2017/5/27.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("Veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
