package matrix;

import java.util.Scanner;


public class Task3e_ConvertibleStrings {
      
  public static void main(String [] args ){
      Scanner input = new Scanner (System.in);
      String text, str,line="coool"; 
      text = input.nextLine();
      str = input.nextLine();
      /*if(text.contains(str)){
          System.out.println(true);
      }else {
          System.out.println(false);
      }*/
      //String num = input.nextLine();
       //System.out.println("Mirror number:");
       for(int j=0;j<=str.length()-1;j++){
          //System.out.print( num.charAt(j));
          for(int k =0;k<= text.length()-1; k++){
             if(str.charAt(j)==text.charAt(k)){
                // text.replace(text.charAt(k), "");
             }
       }
       
  
       }
      
  }
}
