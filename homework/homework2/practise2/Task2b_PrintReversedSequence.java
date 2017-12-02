package homework.homework2.practise2;

import java.util.Scanner;

/**
 * Created by Admin on 12.11.2017 г..
 */
public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        System.out.println("Please enter your num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }



    }


}
