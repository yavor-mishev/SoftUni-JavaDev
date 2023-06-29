package _01_JavaAdvanced._03_SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class _08_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputParts = input.split(" ");

            String[] ipParts = inputParts[0].split("=");
            String ip = ipParts[1];

            String[] userParts = inputParts[2].split("=");
            String name = userParts[1];

            if (!map.containsKey(name)) {
                map.put(name, new LinkedHashMap<>());
            }

            if (!map.get(name).containsKey(ip)) {
                map.get(name).put(ip, 1);
            } else {
                int ipCounter = map.get(name).get(ip) + 1;
                map.get(name).put(ip, ipCounter);
            }
            input = scanner.nextLine();
        }
        for (var attacker : map.entrySet()) {
            System.out.printf("%s:%n", attacker.getKey());
            LinkedHashMap<String, Integer> attacks = attacker.getValue();
            StringBuilder sb = new StringBuilder();

            for (var singleIPattack : attacks.entrySet()) {
                String formattedAttack = String.format("%s => %d, ", singleIPattack.getKey(), singleIPattack.getValue());
                sb.append(formattedAttack);
            }
            String finalOutput = sb.substring(0, sb.length() - 2);
            finalOutput = finalOutput + ".";
            System.out.println(finalOutput);
        }
    }
}
