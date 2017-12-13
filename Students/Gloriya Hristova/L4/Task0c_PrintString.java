package matrix;

import java.util.Scanner;

public class Task0c_PrintString {
   public static void main(String [] args){
       String string;
       Scanner input = new Scanner (System.in);
       System.out.println("Enter string: ");
       string = input.nextLine();
       int l;
       l = string.length();
       for(int i=0; i<l; i++){
           System.out.println(string.charAt(i));
       }
   } 
}
