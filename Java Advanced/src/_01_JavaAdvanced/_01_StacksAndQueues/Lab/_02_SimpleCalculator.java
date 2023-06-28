package _01_JavaAdvanced._01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split(" ");
        List<String> partsList = Arrays.asList(expressionParts);

        ArrayDeque<String> stack = new ArrayDeque<>(partsList);

        while (stack.size() > 1) {
            int firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            int result = 0;

            switch (op) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                default:
                    System.out.println("Unknown operation" + op);
                    return;
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());

    }
}
