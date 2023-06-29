package _01_JavaAdvanced._03_SetsAndMapsAdvanced.Exercise;

import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currChar = input.charAt(i);
            if (!map.containsKey(currChar)) {
                map.put(currChar, 1);
            } else {
                int currCharCount = map.get(currChar);
                currCharCount++;
                map.put(currChar, currCharCount);
            }
        }

        //var -> declare a variable of non-specific type. Java chooses the right type for the variable
        //example:
        //var name = "Pesho"; -> java treats this as a String
        //var age = 23; -> java treats this as an Integer
        //in the forEach loop we can substitute Map.Entry<Character, Integer> with var
        for (var pair : map.entrySet()) {
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());
        }
    }
}
