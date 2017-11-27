package Lesson3.Homework.Task2c_PrintOnlyEvenNumbers;
import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, eneter your number: ");
        int num = sc.nextInt();
        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < num; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}