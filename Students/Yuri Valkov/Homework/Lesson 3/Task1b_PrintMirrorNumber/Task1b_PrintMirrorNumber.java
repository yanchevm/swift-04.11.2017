package homework.homework2.Task1b_PrintMirrorNumber;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int number = sc.nextInt();
        int mirror = 0;
            while (number != 0) {
                byte digit = (byte) (number % 10);
                mirror = ((mirror * 10)) + digit;
                number /= 10;
            }
        System.out.println(mirror);
    }
}