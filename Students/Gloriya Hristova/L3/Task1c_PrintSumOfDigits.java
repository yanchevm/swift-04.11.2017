package mypack;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
     public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter number: ");
       int num;
       int sum =0;
       num= input.nextInt();
       System.out.println("Sum of digits:\t");
	//Милен: БРАВО!
	//Досещаш ли се как може да се напише с while ? 
       for(;num>0;num/=10){
         sum += num%10;
       }
       
        System.out.print(sum);
       System.out.println();
    }
}
