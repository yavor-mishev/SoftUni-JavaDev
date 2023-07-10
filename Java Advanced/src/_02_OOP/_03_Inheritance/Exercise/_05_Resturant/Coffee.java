package _02_OOP._03_Inheritance.Exercise._05_Resturant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private static final double COFFEE_MILLILITERS = 50;
    private static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.5);
    private double caffeine;
    private double milliliters;
    public Coffee(String name, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
