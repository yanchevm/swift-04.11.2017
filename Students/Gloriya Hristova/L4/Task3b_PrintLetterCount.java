package matrix;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
     public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int n;
        String text;
        int counter;
       
        
        System.out.println("Enter string: ");
        text = input.nextLine();
        n=text.length();
        
        
        for(int j = 0; j <n; j++){
            counter=1;
            for(int q=j+1;q<n;q++){
                if(text.charAt(j)==text.charAt(q)){
                    counter++;
                }
            }
            if(j>0){
                for(int k = j-1;k>=0;k--){
                    if(text.charAt(j)!=text.charAt(k)){
                        flag = true;
                    }
                    else{
                        flag= false;
                        break;}
                }if(flag==true){
                    System.out.println(text.charAt(j)+" ("+counter+") ");
                }
            }
            else{
                System.out.println(text.charAt(j)+" ("+counter+") ");
            }
        } 
    }
}
