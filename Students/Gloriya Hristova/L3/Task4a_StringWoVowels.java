package mypack;

import java.util.Scanner;


public class Task4a_StringWoVowels {
    
     public static void main(String[] args) {
         
Scanner input = new Scanner(System.in);
String str;
System.out.println("String:");
str = input.nextLine();

//Милен: БРАВО, добре решение. 
// Подреждай кода!
if(str.contains("a")){
str=str.replace("a","");
}
if(str.contains("i")){
str=str.replace("i","");
}
if(str.contains("o")){
str=str.replace("o","");
}
if(str.contains("e")){
str=str.replace("e","");
}
if(str.contains("u")){
str=str.replace("u","");
}
System.out.println(str);
 
 }
}


