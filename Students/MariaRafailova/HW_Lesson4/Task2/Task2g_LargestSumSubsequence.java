package Task2;

import java.util.Scanner;

public class Task2g_LargestSumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int indStart =0;
        int indEnd = 0;
        int maxStartInd = 0;
        int maxEndInd =0;
        int maxSum = 0;
        for (int i = 0; i < n-1; i++) {
            indStart = i;
            for (int j = n-1; j >= i; j--) {
                int sum =0;
                indEnd = j;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                    maxStartInd = indStart;
                    maxEndInd = indEnd;
                }
            }
        }

        for (int i = maxStartInd; i <= maxEndInd; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
