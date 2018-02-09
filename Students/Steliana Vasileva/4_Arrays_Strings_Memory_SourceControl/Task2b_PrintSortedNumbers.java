package src;

import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            int [] arrayToSort= new int [N];

        for (int i = 0; i < N; i++){
            arrayToSort[i] = sc.nextInt();
        }

         Arrays.sort(arrayToSort);

        for (int j = 0; j <arrayToSort.length; j++){
                System.out.printf("%d"+ " ", arrayToSort[j]);
            }
        }
    }

























