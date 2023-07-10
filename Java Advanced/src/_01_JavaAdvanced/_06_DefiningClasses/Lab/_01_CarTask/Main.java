package _01_JavaAdvanced._06_DefiningClasses.Lab._01_CarTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carInformation = scanner.nextLine().split(" ");

            String brand;
            Car car = null;
            switch (carInformation.length) {
                case 1:
                    brand = carInformation[0];
                    car = new Car(brand);
                    break;
                case 3:
                    brand = carInformation[0];
                    String model = carInformation[1];
                    int horsePower = Integer.parseInt(carInformation[2]);
                    car = new Car(brand, model, horsePower);
                    break;
            }
            System.out.println(car.carInfo());
        }
    }
}
