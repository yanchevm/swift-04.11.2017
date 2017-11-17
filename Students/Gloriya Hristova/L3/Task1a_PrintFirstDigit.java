
package mypack;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter number: ");
       String i;
       i = input.nextLine();
       System.out.println("First digit of the number you entered:\t"+i.charAt(0));
        
        
    }
    
}
