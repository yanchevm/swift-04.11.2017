package Task3;

import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = sc.nextInt();


        for (int i = 0; i < n-2; i++) {
            for (int j = n/2-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int l = 0; l < 2*i+1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //osnova:
        for (int j = 0; j <= n/2; j++) {
                System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int j = 0; j <= n/2-1; j++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();


    }
}
