package matrix;

import java.util.Scanner;

class Palindrome{
    String original,reverse;
    Scanner input = new Scanner (System.in);
    void isPalindrome(){
        original = input.nextLine();
        //this.original = original;
        
       
         StringBuilder strOriginal = new StringBuilder();
         StringBuilder strReverse = new StringBuilder();
         strOriginal.append(original);
         strReverse = strOriginal.reverse();
         System.out.println(strReverse);
         reverse = strReverse.toString();
         if(original.equals(reverse)){
             System.out.println("true");
         }
         else{
             System.out.println("false");
         }
         
        
    }
}

public class Task3a_IsPalindrome {
    public static void main(String [] args){
        System.out.println("Enter String: ");
        Palindrome obj = new Palindrome();
        obj.isPalindrome();
    }
}
