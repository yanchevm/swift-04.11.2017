package matrix;

import java.util.Scanner;

public class Task2a_PrintLargestNumber{
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        int N,max;
        N=5;
        int array[];
        array = new int [N];
        
        do{
            System.out.println("Enter number of entries: ");
            N = input.nextInt();
        }while(N<=0);
        
        System.out.println("Enter numbers: ");
        
        for(int i = 0; i <N; i++){
            array[i] = input.nextInt();
        }
        max=array[0];
        
        for(int i = 0; i <N; i++){
            if(max<array[i]){
                max=array[i];
            }
        }System.out.println(max);
    }
}
