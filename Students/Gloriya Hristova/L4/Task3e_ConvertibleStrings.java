package matrix;

import java.util.Scanner;


public class Task3e_ConvertibleStrings {
      
   public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        boolean flag = false;
        int len1,len2;
        String text1,text2,temp;
        StringBuilder s = new StringBuilder();
        char symbol;
       
        
        System.out.println("Enter strings: ");
        text1 = input.nextLine();
        text2 = input.nextLine();
        len1 = text1.length();
        len2 = text2.length();
        
        if(len2>len1){
            temp=text2;
            text2=text1;
            text1=temp;
        }
        
        for(int j = 0; j <len2; j++){
           
            for(int q = 0; q <len1; q++){
                
                symbol=text2.charAt(j);
                s=s.append(symbol);
                flag = text1.contains(s);
                
                if(flag == false){
                    System.out.println(flag);
                    System.exit(0);
                }
                s.setLength(0);
            }
        } 
        if(flag==true){
            System.out.println(flag);
        }
   }
}