package homework.homework2.practise3;

import java.util.Scanner;

/**
 * Created by Admin on 20.11.2017 г..
 */
public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n-2; i++) {
            for (int j = n/2-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i <= n/2; i++) {
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
