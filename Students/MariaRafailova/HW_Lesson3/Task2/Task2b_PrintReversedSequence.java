package Task2;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number:  ");
        String num = sc.nextLine();

        System.out.println("Please enter "+num +" numbers, separated by space:");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
