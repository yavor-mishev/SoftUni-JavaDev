package _02_OOP._03_Inheritance.Exercise._05_Resturant;

import java.math.BigDecimal;

public class Dessert extends Food {
    private double calories;
    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
