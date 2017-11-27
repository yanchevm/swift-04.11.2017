package Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number:  ");
        String num = sc.nextLine(); //Милен: Ако искаш число от потребителя, можеш ли да използваш nextInt ?

        System.out.println("Please enter "+num +" numbers, separated by space:");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

	// Милен: БРАВО!
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
}
