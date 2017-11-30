package mypack;

import java.util.Scanner;


public class Task1b_PrintMirrorNumber {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter number: ");
       String num;
      
       num = input.nextLine();
       System.out.println("Mirror number:");
       for(int j=num.length()-1;j>=0;j--){ //Милен: Много добре си се досетила
          System.out.print( num.charAt(j));
       }
       
        
       System.out.println();
    }
}
