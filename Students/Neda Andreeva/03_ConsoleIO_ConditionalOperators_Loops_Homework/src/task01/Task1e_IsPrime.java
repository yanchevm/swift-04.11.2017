package task01;

import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        int currentDivisor = 2;

        while (currentDivisor < number) {
            if (number % currentDivisor == 0) {
                isPrime = false;
                break;
            }

            currentDivisor++;
        }

        System.out.println(isPrime);
    }
}
