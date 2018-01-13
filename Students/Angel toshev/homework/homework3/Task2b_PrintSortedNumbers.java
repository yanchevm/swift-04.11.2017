package homework.homework3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Admin on 25.11.2017 г..
 */
public class Task2b_PrintSortedNumbers {
    public   static  void sort(int []arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){ // Милен: Знаш ли как се нарича сортирането което си имплементирал ? 
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0;i<arr.length;i++){
            arr[i]=rand.nextInt(20); // Милен: БРАВО, много хубаво решение!
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        sort(arr);

    }
}
