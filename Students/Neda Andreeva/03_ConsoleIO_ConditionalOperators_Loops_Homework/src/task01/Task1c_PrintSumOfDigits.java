package task01;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = sc.nextInt();
        byte sum = 0;

        while (number != 0) {
            byte currentDigit = (byte)(number % 10);
            sum += currentDigit;
            number /= 10;
        }

        System.out.println(sum);
    }
}
