package com.evan.pattern.factory.version2;

/**
 * 工厂类可以有更多的客户
 */
public class SimplePizzaFactory {
    /**
     * 该方法可以为静态，就不用实例化工厂类。但也有缺点，不能通过继承来改变创建方法的行为
     */
    public Pizza createPizza(String type) {
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
        return pizza;
    }
}
