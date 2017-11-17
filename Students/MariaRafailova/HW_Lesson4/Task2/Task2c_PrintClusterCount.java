package Task2;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]){
                if(i!=0 && (arr[i] == arr[i-1])){
                    continue;
                }
                count++;
            }
        }

        System.out.println(count);
    }
}
