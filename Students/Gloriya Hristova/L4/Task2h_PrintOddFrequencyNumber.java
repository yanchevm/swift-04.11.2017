package matrix;

import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {
    
    public static void main(String [] args){
     
        Scanner input = new Scanner(System.in);
        int n;
        int num;
        int frequency;
         int array[];
         
        do{
            System.out.println("Enter number of entries: ");
            n = input.nextInt();
        }while(n<=0);
        
        array = new int[n];
        System.out.println("Enter numbers: "); 
        for(int i = 0; i <n; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0; i <n; i++){
            num = array[i];
            frequency =1;
            for(int j = i+1; j <n; j++){
            
                if(array[j]==num){
                    frequency++;
                }
        }
          
            if(frequency%2!=0){
                System.out.println("Odd frequency number: "+array[i]);
                break;
            }
        }
    
    } 
}
