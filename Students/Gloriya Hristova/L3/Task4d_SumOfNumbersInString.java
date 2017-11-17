package mypack;

import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    
    public static void main(String [] args){
        
       Scanner input = new Scanner (System.in);
       String txt;
       
       System.out.println("Enter string: ");
       txt = input.nextLine();
       int sum=0;
   
     String[] wordArray = txt.trim().split("\\s+");
     int wordCount = wordArray.length;
     
     String[] parts=txt.split(" ");
     for(int i=0; i<wordCount; i++){  
         String part1 = parts[i];
         if (part1.matches(".*\\d+.*")){
             int n = Integer.parseInt(part1);
             sum+=n;
         }
}
     System.out.println("The sum of numbers in the string is " + sum+". ");
    }
}
