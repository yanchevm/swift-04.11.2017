package Homework.HWLecture4.Task2;
import java.util.Scanner;
import java.util.Random;

public class Task2e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
     //   System.out.print("Enter size: ");
       // int size = sc.nextInt();
      //  int arr[] = new int[size];
        int arr1[]={9 ,8 ,1, 2, 6 ,9, 4, 8 ,9 ,3 };

//        for (int i = 0; i < size; i++) {
//            arr[i] = rand.nextInt(10) + 1;
//        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");

        }
        System.out.println();
        for (int i = 0; i < arr1.length-2; i++) {
            if (arr1[i]<=arr1[i+1]){
                System.out.print(arr1[i]+" ");
            }


        }


    }
}
