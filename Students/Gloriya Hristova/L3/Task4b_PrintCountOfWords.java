package mypack;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    
    public static void main(String [] args){
        
       Scanner input = new Scanner (System.in);
       String txt = "";
      
       
      
       System.out.println("Enter string: ");
       txt = input.nextLine();
      
String[] wordArray = txt.trim().split("\\s+");
     int wordCount = wordArray.length;
    
     if (txt.contains("0")){
         wordCount--;
     }
     if (txt.contains("1")){
         wordCount--;
     }
     if (txt.contains("2")){
         wordCount--;
     }
     if (txt.contains("3")){
         wordCount--;
     }
     if (txt.contains("4")){
         wordCount--;
     }
     if (txt.contains("5")){
         wordCount--;
     }
     if (txt.contains("6")){
         wordCount--;
     }
     if (txt.contains("7")){
         wordCount--;
     }
     if (txt.contains("8")){
         wordCount--;
     }
     if (txt.contains("9")){
         wordCount--;
     }
     System.out.println("Word count is = " + wordCount);
         
    }
}
