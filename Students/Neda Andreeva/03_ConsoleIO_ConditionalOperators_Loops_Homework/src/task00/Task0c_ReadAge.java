package task00;

import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter your age: ");
        byte age = sc.nextByte();

        if (age > 0) {
            if (age < 18) {
                System.out.println("You are underage!");
            } else {
                System.out.println("You are an adult!");
            }
        }
        else
        {
            System.err.println("Error! Your age cannot be a negative number!");
        }
    }
}
