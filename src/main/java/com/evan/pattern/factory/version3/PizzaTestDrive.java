package com.evan.pattern.factory.version3;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new com.evan.pattern.factory.version3.NYPizzaStore();
        PizzaStore chicagoStore = new com.evan.pattern.factory.version3.ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");


    }
}
