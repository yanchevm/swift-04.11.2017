package task01;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = sc.nextInt();
        int mirrorNumber = 0;

        while (number != 0) {
            byte currentDigit = (byte)(number % 10);
            mirrorNumber = ((10 * mirrorNumber) + currentDigit);
            number /= 10;
        }

        System.out.println(mirrorNumber);
    }
}
