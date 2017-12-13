package task01;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = sc.nextInt();
        byte currentDigit = 0;

        //Милен: БРАВО!
        while (number != 0) {
            currentDigit = (byte)(number % 10);
            number /= 10;
        }

        System.out.println(currentDigit);
    }
}
