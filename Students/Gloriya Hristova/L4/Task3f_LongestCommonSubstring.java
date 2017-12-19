package matrix;

import java.util.Scanner;

public class Task3f_LongestCommonSubstring {
    
 private static String longestCommonSubstring(String str1, String str2){
     
    int start = 0;
    int max = 0;
    
    for (int i = 0; i < str1.length(); i++){
        
        for (int j = 0; j < str2.length(); j++){
            int x = 0;
            while(str1.charAt(i + x) == str2.charAt(j + x)){
                x++;
                if(((i + x) >= str1.length()) || ((j + x) >= str2.length())){
                    break;
                }
            }
            if (x > max){
                max = x;
                start = i;
            }
         }
    }
    return str1.substring(start, (start + max));
}
    
   public static void main(String [] args){
       
        Scanner input = new Scanner(System.in);
        String text1,text2;
        
       
        
        System.out.println("Enter strings: ");
        text1 = input.nextLine();
        text2 = input.nextLine();
        
        System.out.println(longestCommonSubstring(text1,text2));
            
           
   }
}

