package _01_JavaAdvanced._03_SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class _01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wordCount = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        for (int i = 0; i < wordCount; i++) {
            uniqueWords.add(scanner.nextLine());
        }

        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}
