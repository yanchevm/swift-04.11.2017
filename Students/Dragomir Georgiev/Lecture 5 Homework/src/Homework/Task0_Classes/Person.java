package Homework.Task0_Classes;

public class Person {

    private String name;
    private int age;


    public Person() {
        this.name = "No name";
        this.age = -1;
    }

    public Person(String name) {
        this.name = name;
        this.age = -1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int age() {
        return age;
    }

    public void sentence() {
        if (age == -1 && name.equals("No name")) {
            System.out.println("I am John Doe");
        } else if (age == -1) {
            System.out.println("Hello, I am " + name + ".");
        } else {
            System.out.println("Hello, I am " + name + ". I am " + age + " years old.");
        }
    }

}

