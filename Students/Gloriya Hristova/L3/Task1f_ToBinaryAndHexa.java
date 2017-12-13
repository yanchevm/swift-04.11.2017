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
           switch(x%16){
          
               case 0:result ='0';break;
               case 1:result ='1';break;
               case 2:result ='2';break;
               case 3:result ='3';break;
               case 4:result ='4';break;
               case 5:result ='5';break;
               case 6:result ='6';break;
               case 7:result ='7';break;
               case 8:result ='8';break;
               case 9:result ='9';break;
               case 10:result ='A';break;
               case 11:result ='B';break;
               case 12:result ='C';break;
               case 13:result ='D';break;
               case 14:result ='E';break;
               case 15:result ='F';break;
        
           }
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
