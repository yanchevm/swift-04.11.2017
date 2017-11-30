package mypack;

import java.util.Scanner;


public class Task2b_PrintReversedSequence {
     public static void main(String [] args){
         Scanner input = new Scanner(System.in);
         int array[];
         int n;
         n=5;
         array = new int [n];
         do{
             System.out.println("Enter number of entries: ");
             n = input.nextInt();
        }while(n<=0);

         System.out.println("Enter numbers: ");
         for(int i = 0; i <n; i++){
               
               array[i] = input.nextInt();
               
           }
         for(int i = n-1; i >=0; i--){ //Милен: БРАВО!
            System.out.print(array[i]+" ");
        }
} 
}
