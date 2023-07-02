package _01_JavaAdvanced._03_SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _12_SrubskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> concerts = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            if (!input.contains(" @")) {
                continue;
            }

            String singer = input.substring(0, input.indexOf("@") - 1);
            int firstIndexOfNumber = 0;
            for (int i = input.indexOf("@"); i < input.length(); i++) {
                char currentSymbol = input.charAt(i);
                if (Character.isDigit(currentSymbol) && input.charAt(i - 1) == ' ') {
                    firstIndexOfNumber = i;
                    break;
                }
            }
            if (firstIndexOfNumber == 0) {
                continue;
            }
            String venue = input.substring(input.indexOf("@") + 1, firstIndexOfNumber - 1);
            String numbers = input.substring(firstIndexOfNumber);
            int price = Integer.parseInt(numbers.split(" ")[0]);
            int capacity = Integer.parseInt(numbers.split(" ")[1]);

            if (!concerts.containsKey(venue)) {
                LinkedHashMap<String, Integer> singers = new LinkedHashMap<>();
                singers.put(singer, price * capacity);
                concerts.put(venue, singers);
            } else {
                LinkedHashMap<String, Integer> currSingers = concerts.get(venue);
                if (currSingers.containsKey(singer)) {
                    currSingers.put(singer, currSingers.get(singer) + price * capacity);
                } else {
                    currSingers.put(singer, price * capacity);

                }
                concerts.put(venue, currSingers);

            }
            input = scanner.nextLine();
        }

        for (String venue : concerts.keySet()) {
            System.out.println(venue);

            LinkedHashMap<String, Integer> singers = concerts.get(venue);

            singers.entrySet()
                    .stream()
                    .sorted((singer1, singer2) -> singer2.getValue().compareTo(singer1.getValue()))
                    .forEach(singer -> System.out.printf("#  %s -> %d%n", singer.getKey(), singer.getValue()));
        }
    }
}
