package matrix;

import java.util.Scanner;

public class Task0b_ReadArray {
    
public static void main (String [] args){
    
Scanner input = new Scanner (System.in);
    int array[];
         int N;
     do{   

        System.out.println("Enter number of entries: ");
        N = input.nextInt();
        }while(N<=0);
        array = new int [N];
        System.out.println("Enter numbers: "); 
           for(int i = 0; i <N; i++){
               
               array[i] = input.nextInt();
           }
           for(int i = 0; i <N; i++){
               if(i<N-1){
                   System.out.print(array[i]+", "); 
               }else{
                   System.out.print(array[i]);
               }
           }
           System.out.println();
}
}