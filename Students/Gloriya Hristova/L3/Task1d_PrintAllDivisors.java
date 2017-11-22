package mypack;

import java.util.Scanner;


public class Task1d_PrintAllDivisors {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
       System.out.println("Enter number: ");
       int num;
       num= input.nextInt();
       System.out.println("Divisors:\t");
       for(int i =1; i<=num; i++){
         if(num%i==0){
             System.out.print(i+" ");
         }
       }
       System.out.println();
    }
}
