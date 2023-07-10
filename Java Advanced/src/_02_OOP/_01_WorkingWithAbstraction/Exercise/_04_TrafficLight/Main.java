package _02_OOP._01_WorkingWithAbstraction.Exercise._04_TrafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> colors = Arrays.stream(scanner.nextLine().split(" ")).toList();


        List<TrafficLight> trafficLights = new ArrayList<>();
        for (String color : colors) {
            Color currColor = Color.valueOf(color);
            TrafficLight currTrafficLight = new TrafficLight(currColor);
            trafficLights.add(currTrafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            //change color
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
