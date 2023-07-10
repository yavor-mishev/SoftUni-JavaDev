package _02_OOP._02_Encapsulation.Lab._01_SortByNameAndAge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);

            Person person = new Person(firstName, lastName, age);
            people.add(person);
        }

        Collections.sort(people, (firstPerson, secondPerson) -> {
            int result = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (result != 0) {
                return result;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

}
