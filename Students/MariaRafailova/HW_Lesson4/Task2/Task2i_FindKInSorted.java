package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2i_FindKInSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number N: ");
        int n = sc.nextInt();

        System.out.println("Please enter a number K: ");
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Arrays.binarySearch(arr, k);
       if(result >=0){
           System.out.println(result);
       } else {
           System.out.println("NO");
       }

    }
}
