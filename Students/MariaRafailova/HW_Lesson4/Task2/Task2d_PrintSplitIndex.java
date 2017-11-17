package Task2;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j<= i; j++) {
                sum1 += arr[j];
            }
            for (int k = i+1; k <= n-1; k++) {
                sum2 += arr[k];
            }
            if (sum1 == sum2){
                index = i;
                break;
            }
        }

       if(index != 0){
           System.out.println(index);
       } else {
           System.out.println("NO");
       }

    }
}
