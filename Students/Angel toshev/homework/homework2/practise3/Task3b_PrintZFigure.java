package homework.homework2.practise3;

import java.util.Scanner;

/**
 * Created by Admin on 20.11.2017 г..
 */
public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
	// Милен: Отново браво, правилен е алгоритъма.
        for (int i =0; i<n; i++) {
            for ( int j=0; j<n; j++) {
                if (i == 0 || i == (n - 1)) {
                    System.out.print("* ");
                }
                else {
                    if (j == (n -i -1)) {
                        System.out.print("*");
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
