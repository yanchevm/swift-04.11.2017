package mypack;

import java.util.Scanner;


class Functions{
    static void ToBinary(int x){
     
        StringBuilder str = new StringBuilder();
        while(x > 0)
        {
           int result = x%2;
           str.append(result);
           x = x/2;
        
                
        }
       System.out.println(str.reverse());
       
    }
    static void ToHexadecimal(int x){
        StringBuilder str = new StringBuilder();
        char result=0; 
        while(x > 0)
        {
           
           
           if(x%16 ==0){result ='0';}
           if(x%16 ==1){result ='1';}
           if(x%16 ==2){result ='2';}
           if(x%16 ==3){result ='3';}
           if(x%16 ==4){result ='4';}
           if(x%16 ==5){result ='5';}
           if(x%16 ==6){result ='6';}
           if(x%16 ==7){result ='7';}
           if(x%16 ==8){result ='8';}
           if(x%16 ==9){result ='9';}
           if(x%16 ==10){result ='A';}
           if(x%16 ==11){result ='B';}
           if(x%16 ==12){result ='C';}
           if(x%16 ==13){result ='D';}
           if(x%16 ==14){result ='E';}
           if(x%16 ==15){result ='F';}
           x = x/16;
       
           str.append(result);
        }
        
               System.out.println(str.reverse()); 
        }
       
       
    }
    
public class Task1f_ToBinaryAndHexa {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter number: ");
       int num;
       num= input.nextInt();
       //System.out.println(Integer.toBinaryString(num));
       Functions.ToBinary(num);
       //System.out.println(Integer.toHexString(num));
       Functions.ToHexadecimal(num);
    }
}
