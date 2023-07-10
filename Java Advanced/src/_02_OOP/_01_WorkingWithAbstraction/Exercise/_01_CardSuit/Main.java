package _02_OOP._01_WorkingWithAbstraction.Exercise._01_CardSuit;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        Arrays.stream(CardSuit.values())
                .forEach(cardSuit -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name()));
    }
}
