package _01_JavaAdvanced._01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split("");

        ArrayDeque<Integer> openBracketIndex = new ArrayDeque<>();

        for (int i = 0; i < expressionParts.length; i++) {
            if (expressionParts[i].equals("(")) {
                openBracketIndex.push(i);
            } else if (expressionParts[i].equals(")")) {
                int indexOpenBracket = openBracketIndex.pop();
                int closingBracketIndex = i + 1;
                String expressionToExtract = expression.substring(indexOpenBracket, closingBracketIndex);
                System.out.println(expressionToExtract);
            }
        }
    }
}
