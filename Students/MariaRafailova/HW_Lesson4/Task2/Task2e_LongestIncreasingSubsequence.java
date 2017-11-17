package Task2;

import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
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
        int difference =0;
        int maxDiff = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]){
                if (i == 0 || arr[i] < arr[i-1]){
                    indStart = i;
                }
                indEnd = i+1;

                difference =indEnd - indStart;
                if(difference> maxDiff){
                    maxDiff = difference;
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
