package _02_OOP._03_Inheritance.Exercise._05_Resturant;

import java.math.BigDecimal;

public class Food extends Product{
    private double grams;
    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
