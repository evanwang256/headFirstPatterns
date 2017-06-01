package com.evan.pattern.decorator.version1;

/**
 * Created by wangzhen318 on 2017/5/16.
 */
public abstract class Beverage {
    protected String description;
    private boolean milk;
    private double milkCost = 0.1;
    private boolean soy;
    private double soyCost = 0.15;
    private boolean mocha;
    private double mochaCost = 0.2;
    private boolean whip;
    private double whipCost = 0.1;

    public String getDescription() {
        return description;
    }

    public double cost() {
        double condimentCost = 0;
        if (hasMilk()) {
            condimentCost += milkCost;
        }
        if (hasSoy()) {
            condimentCost += soyCost;
        }
        if (hasMocha()) {
            condimentCost += mochaCost;
        }
        if (hasWhip()) {
            condimentCost += whipCost;
        }
        return condimentCost;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
