package Task2;

import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if(arr[i] != 0){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        arr[j]=0;
                        count +=1;
                    }
                }
            }
            if (count%2 != 0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
