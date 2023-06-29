package _01_JavaAdvanced._03_SetsAndMapsAdvanced.Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class _02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] setSizes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = setSizes[0];
        int m = setSizes[1];

        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        fillSet(scanner, n, firstSet);

        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        fillSet(scanner, m, secondSet);

        //using forEach

        for (String elem : firstSet) {
            if (secondSet.contains(elem)) {
                System.out.print(elem + " ");
            }
        }

    }

    private static void fillSet(Scanner scanner, int size, LinkedHashSet<String> set) {
        for (int i = 0; i < size; i++) {
            set.add(scanner.nextLine());
        }
    }
}
