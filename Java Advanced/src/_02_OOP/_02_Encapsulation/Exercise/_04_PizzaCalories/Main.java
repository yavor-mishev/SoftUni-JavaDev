package _02_OOP._02_Encapsulation.Exercise._04_PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split(" ");
        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);

        String[] doughData = scanner.nextLine().split(" ");
        String flourType = doughData[1];
        String bakingTechnique = doughData[2];
        double doughWeight = Double.parseDouble(doughData[3]);


        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
            pizza.setDough(dough);

            String topping = scanner.nextLine();
            while (!"END".equals(topping)) {
                String[] toppingData = topping.split(" ");
                String toppingType = toppingData[1];
                double toppingWeight = Double.parseDouble(toppingData[2]);

                Topping toppingToAdd = new Topping(toppingType, toppingWeight);
                pizza.addTopping(toppingToAdd);

                topping = scanner.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
