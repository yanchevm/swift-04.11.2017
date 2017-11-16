package task01;

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = sc.nextInt();
        int currentDivisor = 1;

        while (number >= currentDivisor) {
            if (number % currentDivisor == 0) {
                System.out.print(currentDivisor + " ");
            }

            currentDivisor++;
        }

    }
}
