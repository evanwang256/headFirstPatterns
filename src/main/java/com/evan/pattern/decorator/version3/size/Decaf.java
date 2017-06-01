package com.evan.pattern.decorator.version3.size;


/**
 * 脱因咖啡.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
