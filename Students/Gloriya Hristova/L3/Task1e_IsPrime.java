package mypack;

import java.util.Scanner;

class Fun{
   public static void IsPrime(int x){
       int counter=0;
 	//Милен: Интересно решение :). А можеш ли да оптимизираш алгоритъма ?
       for(int i =1; i<=x; i++){
         if(x%i==0){
             counter++;
         }
       }
        if(counter>2){
             System.out.println(false);
             
    }else{ System.out.println(true);}
   }
}
   


public class Task1e_IsPrime {
  
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter number: ");
       int num;
       num= input.nextInt();
       Fun.IsPrime(num); //Милен: БРАВО за решението!
    }
}
