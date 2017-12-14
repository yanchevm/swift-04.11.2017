package matrix;

import java.util.Scanner;

public class Task3f_LongestCommonSubstring {
    

  public static void main(String [] args ){
      Scanner input = new Scanner (System.in);
      StringBuilder objective =new  StringBuilder();
      String text, str, letter, line, commonLine="",swap; 
      text = input.nextLine();
      int max =0;
      int i=0;
   int len;
   str = input.nextLine();
      if (str.length()>text.length()){
          swap=str;
          str =text;
          text = swap;
      }
      
      
      String[] main = new String[str.length()];//
   for(int k=0;k<str.length();k++){//
       
    for(i=k+commonLine.length(); i<str.length();i++){
       
        char l =str.charAt(i);
        letter = new StringBuilder().append(l).toString();
        if(text.contains(letter)){
            objective.append(str.charAt(i));
            line = objective.toString();
            len = line.length();
            
            if(text.contains(line)){
                if(max<len){
                max=len;
                commonLine =line;
                //main[i]=commonLine;//
            }
            
        }
        }
        
    }
   main[k]=commonLine;
   k++;
   i+=commonLine.length();
   }
   for(int k=0;k<str.length();k++ ){
       System.out.println(main[k]);
   }
    System.out.println("Longest common substring:" + commonLine);
  }
  }
    

