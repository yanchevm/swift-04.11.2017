package src;
import java.util.Arrays;
import java.util.Scanner;

public class Task2i_FindKInSorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] newIntArray = new int[n];

        for (int i=0; i<newIntArray.length; i++){
            newIntArray[i]=sc.nextInt();
        }
        Arrays.sort(newIntArray);

        if (Arrays.binarySearch(newIntArray,k)==(-(k-1))){
            System.out.println("NO");
        } else
            System.out.println(Arrays.binarySearch(newIntArray,k));
           }
        }

