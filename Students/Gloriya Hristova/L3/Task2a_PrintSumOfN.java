package mypack;

import java.util.Scanner;


public class Task2a_PrintSumOfN {

public static void main (String [] args){

         Scanner input = new Scanner(System.in);
         
         int array[];
         int sum = 0;
         int N;
         N=5;
         
         array = new int [N];
         do{
             System.out.println("Enter number of entries: ");
             N = input.nextInt();
         }while(N<=0);
         System.out.println("Enter numbers: ");
         for(int i = 0; i <N; i++){
               //Милен: С този подход, имаш ли нужда от масива ?
               array[i] = input.nextInt();
               sum+=array[i];
         }System.out.println("Sum of numbers: "+sum);  
}
}
