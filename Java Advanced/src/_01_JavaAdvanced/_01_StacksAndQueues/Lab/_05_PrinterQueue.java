package _01_JavaAdvanced._01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (printerQueue.size() < 1) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(command);
            }
            command = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
