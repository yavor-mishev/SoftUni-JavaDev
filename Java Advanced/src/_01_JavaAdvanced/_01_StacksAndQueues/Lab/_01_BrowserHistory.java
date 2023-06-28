package _01_JavaAdvanced._01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        String command = scanner.nextLine();
        while (!command.equals("Home")) {
            if (!command.equals("back")) {
                browserHistory.push(command);
                System.out.println(browserHistory.peek());
            } else {
                if (browserHistory.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }
            }
            command = scanner.nextLine();
        }
    }
}
