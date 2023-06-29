package _01_JavaAdvanced._03_SetsAndMapsAdvanced.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int compoundCount = Integer.parseInt(scanner.nextLine());

        TreeSet<String> uniqueElements = new TreeSet<>();

        for (int i = 0; i < compoundCount; i++) {
            String[] compound = scanner.nextLine().split(" ");
            uniqueElements.addAll(Arrays.asList(compound));
        }
        for (String elem : uniqueElements) {
            System.out.print(elem + " ");
        }
    }
}
