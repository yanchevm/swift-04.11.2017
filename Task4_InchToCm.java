package mypack;

import java.util.Scanner;

public class Task4_InchToCm {
    
    public static void main(String [] args){
        
     float inch;
     float cm;
     // Милен: Използваш системния вход - БРАВО!
     Scanner input = new Scanner(System.in);
     System.out.print("Enter height/length in inches:\t"); // Милен: Използваш специални символи - БРАВО!
     inch = input.nextFloat();
     cm= inch*(float)2.54; // Милен: '2.54' ще се променя ли ? Ако не, какво можеш да направиш с нея ? 
     if(cm%(int)cm<0.01){
         
     
     System.out.printf("Equal to %.4f centimeters.\n", cm); // Милен: Използваш printf - БРАВО!
    }else{
         System.out.println("Equal to "+cm+" centimeters.");
     }
    }
}
