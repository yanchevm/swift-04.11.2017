package Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<arr.length; i++)
        {
            for (int j = 0; j<arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);

    }
}
