package homework.homework3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Admin on 25.11.2017 г..
 */
public class Task2c_PrintClusterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();
        int []arr = new int[n];


        for (int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println();
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1])
                counter++;


        }
        System.out.println(counter);


    }
}
