package homework.homework3;

import java.util.Scanner;

/**
 * Created by Admin on 23.11.2017 г..
 */
public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for (int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i]!=arr.length)
            System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]);
        }

    }
}
