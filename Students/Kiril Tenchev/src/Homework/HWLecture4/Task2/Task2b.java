package Homework.HWLecture4.Task2;
import java.util.Scanner;
import java.util.Random;
public class Task2b {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > next) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = next;
        }
    }

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
        //Милен: БРАВО!
        insertionSort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+",");

        }


    }
}
