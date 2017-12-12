package matrix;

import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
    public static void printLogestIncreasingSubsequence(int arr[],int n){
        
        int maxLength = 1;
        int momentaryLength = 1;
        int maxIndex = 0;
        for (int i = 1; i < n; i++){
            if (arr[i] > arr[i-1]){
                momentaryLength++;
            }
            else{
                if (maxLength < momentaryLength){
                    maxLength = momentaryLength;
                    maxIndex = i - maxLength;
                }
                momentaryLength = 1;    
            }    
        }
        if (maxLength < momentaryLength){ 
            maxLength = momentaryLength;
            maxIndex = n - maxLength;
        }
        for (int i = maxIndex; i < maxLength+maxIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }
     
   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter number of entries: ");
            n = input.nextInt();
        }while(n<=0);
        int[] array = new int [n];
        
        System.out.println("Enter numbers: ");
        for(int i = 0; i <n; i++){
            array[i] = input.nextInt();
        }
        printLogestIncreasingSubsequence(array, n);
        System.out.println();
    }
}
