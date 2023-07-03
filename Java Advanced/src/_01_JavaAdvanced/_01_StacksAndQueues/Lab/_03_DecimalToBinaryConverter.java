package _01_JavaAdvanced._01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();
        if (decimal == 0) {
            System.out.println(0);
        }

        while (decimal != 0) {
            binaryStack.push(decimal % 2);
            decimal /= 2;
        }

        while (!binaryStack.isEmpty()) {
            System.out.print(binaryStack.pop());
        }
    }
}
