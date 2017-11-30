package Homework.HWLecture4.Task2;
import java.util.Scanner;
import java.util.Random;
public class Task2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=rand.nextInt()%100;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+",");

        }
        System.out.println();
        int largest = arr[0];
        for (int i = 1; i < size ; i++) {
            if(arr[i]>largest){
               largest=arr[i];
            }
        }
        System.out.println("Largest: "+largest);

    }
}
