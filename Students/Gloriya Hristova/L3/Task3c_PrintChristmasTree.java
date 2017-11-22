package mypack;

import java.util.Scanner;


public class Task3c_PrintChristmasTree {
     public static void main(String [] args){
        int height;
        Scanner input = new Scanner(System.in);
        
      do{System.out.println("Enter height of the Christmas tree: ");  
      height = input.nextInt();
      }while(height<=2);
      
      height=height-2;
      int width;
      width= 2*height-1;
      
     
         for (int i = 0; i < height; i++) {
   for (int j = 0; j < width - i; j++){
       System.out.print(" ");}
   for (int k = 0; k < (2 * i + 1); k++){
       System.out.print("*");}
   System.out.println();
  }
         for (int i = 0; i < 2; i++) {
   for (int j = 0; j < width - i; j++){
       System.out.print(" ");
   }
   for (int k = 0; k < (2 * i + 1); k++){
       System.out.print("*");
   }
   System.out.println();
  }
     } 
    
}
