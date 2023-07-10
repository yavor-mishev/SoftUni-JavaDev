package _02_OOP._03_Inheritance.Exercise._06_Animals;

public class Dog extends Animal {
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return "Woof!";
    }
}
