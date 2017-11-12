package task07;

import java.util.Scanner;

/**
 * Created by neda.andreeva on 11/06/2017.
 */
public class Task7_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        String lastName = scan.next();
        short year = scan.nextShort();
        float weight = scan.nextFloat();
        float height = scan.nextFloat();
        String profession = scan.next();

        // Програмата ще работи ли през 2018 година :) ?
        // Можеш да експериментираш това: https://docs.oracle.com/javase/8/docs/api/java/time/Year.html#now--
        byte age = (byte)(2017 - year);

        String message = firstName + " " + lastName + " is " + age + " years old. His weight is " + weight + " and his height is " + height + "cm tall. He is a " + profession + ".";
        System.out.println(message);
    }
}
