package mypack;

import java.util.Scanner;


public class Task2c_PrintOnlyEvenNumbers {
   public static void main(String [] args){
         Scanner input = new Scanner(System.in);
         int n;
         n=5;
         int array[];
         array = new int [n];
         do{
             System.out.println("Enter number of entries: ");
             n = input.nextInt();
        }while(n<=0);
         System.out.println("Enter numbers: ");
        
           for(int i = 0; i <n; i++){
               
               array[i] = input.nextInt();
               
         }
           for(int i = 0; i <n; i++){
               if(array[i]%2==0){
                   System.out.print(array[i]+" ");
             }} System.out.println();
        }
      
}
     

