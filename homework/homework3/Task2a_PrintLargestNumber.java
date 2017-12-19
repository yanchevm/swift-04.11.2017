package homework.homework3;

import java.util.Scanner;

/**
 * Created by Admin on 25.11.2017 г..
 */
public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of array");
        int num = sc.nextInt();
        int max=0;
        int [] arr = new int[num];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<arr.length;i++){
            System.out.printf("%d\t",arr[i]);
        }
        System.out.println();
        for (int i = 0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }

        }
        System.out.printf("The bigest num in array is %d",max);
    }
}
