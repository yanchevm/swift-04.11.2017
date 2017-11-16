package Task3;

import java.util.Scanner;

public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n-2; i++) {
            for (int j = n-2-i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
