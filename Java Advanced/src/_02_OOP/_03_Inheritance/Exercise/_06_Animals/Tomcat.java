package _02_OOP._03_Inheritance.Exercise._06_Animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    public String produceSound() {
        return "MEOW";
    }
}
