package _02_OOP._03_Inheritance.Exercise._05_Resturant;

import java.math.BigDecimal;

public class Beverage extends Product {
    private double milliliters;
    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
