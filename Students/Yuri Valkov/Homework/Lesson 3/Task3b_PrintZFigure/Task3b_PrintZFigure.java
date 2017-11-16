package Lesson3.Homework.Task3b_PrintZFigure;
import java.util.Scanner;


public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" Please, enter your number: ");
            for (int i =0; i<n; i++) {
                for ( int k=0; k<n; k++) {
                    if (i == 0 || i == (n - 1)) {
                        System.out.print("* ");
                    }
                    else {
                        if (k == (n -i -1)) {
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

