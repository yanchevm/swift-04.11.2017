package Task2;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxNum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }

        System.out.println(maxNum);

    }
}
