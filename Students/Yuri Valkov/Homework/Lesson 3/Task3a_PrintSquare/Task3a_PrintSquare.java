package Lesson3.Homework.Task3a_PrintSquare;
import java.util.Scanner;


public class Task3a_PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter your number: ");
        int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (i == 0 || i == (n - 1)) {
                    System.out.print("* ");
                } else {
                    if (k == 0 || k == (n - 1)) {
                        System.out.print("* ");
                    }
                     else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
            }
        }
    }

