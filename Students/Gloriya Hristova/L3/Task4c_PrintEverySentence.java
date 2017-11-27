package mypack;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String []args){
         Scanner input = new Scanner (System.in);
       String  txt;
       System.out.println("Enter string: ");
       txt = input.nextLine();
       
       if(txt.contains(". ")){
           txt=txt.replace(". ",".\n");}
       if(txt.contains("? ")){
           txt=txt.replace("? ","?\n");}
       if(txt.contains("! ")){
           txt=txt.replace("! ","!\n");}
       if(txt.contains("?! ")){
           txt=txt.replace("?! ","?!\n");}
       
           System.out.println(txt);
       
    }
}
