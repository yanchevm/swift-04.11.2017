package mypack;

import java.util.Scanner;

public class Task0a_ReadInt {
    
    public static void main(String [] args){
        /*
        Scanner input = new Scanner(System.in);// за единствена цифра от число
        String num;
        System.out.println("Enter number: ");
        num = input.nextLine();

        char symbol;
        symbol = num.charAt(0);
        System.out.println(symbol);
        
        symbol++;
       
        System.out.println(symbol);*/
        
        Scanner input = new Scanner(System.in);
         int nmb;
       
        System.out.println("Enter number: ");
       
        nmb = input.nextInt();
        nmb++;
        System.out.println(nmb);
        
    }
    
}
