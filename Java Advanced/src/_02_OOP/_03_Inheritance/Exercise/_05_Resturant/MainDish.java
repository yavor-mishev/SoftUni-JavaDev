package _02_OOP._03_Inheritance.Exercise._05_Resturant;

import java.math.BigDecimal;

public class MainDish extends Food{
    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
