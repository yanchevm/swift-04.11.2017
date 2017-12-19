package matrix;

import java.util.Scanner;
//import java.util.Arrays;
//import java.util.Random;

class Sort{  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];  
                    arr[j] = temp;
                }
            }  
        }
    }
}  


public class Task2b_PrintSortedNumbers{
    
    public static void main(String [] args){
        //int[] array = new int[10];
        //Random rand = new Random();
        int N,max;
        
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter number of entries: ");
            N = input.nextInt();
        }while(N<=0);
        
        int array[];
        array = new int [N];
        
        System.out.println("Enter numbers: ");
        
        for(int i = 0; i <N; i++){
            array[i] = input.nextInt();
        }
        //for (int i = 0; i < array.length; i++){
        //array[i] = rand.nextInt(100) + 1;}
        //Arrays.sort(array);
        Sort.bubbleSort(array);
        //System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }
}