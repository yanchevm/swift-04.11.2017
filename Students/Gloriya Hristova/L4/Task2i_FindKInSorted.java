package matrix;

import java.util.Scanner;
import java.util.Arrays; 

public class Task2i_FindKInSorted {
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String text,txt;
        String number;
        int N,K;
        
        do{
            text = input.nextLine();
            
            String []parts=text.trim().split(" ");
            String n =parts[0];
            String num = parts[1];
            
            N= Integer.parseInt(n);
            K = Integer.parseInt(num);
            
            System.out.println(N+" "+K);
            
            if(N<=0){
                System.out.println("Enter valid number of entries in the sorted array and"
                      + " the number,the index of which you're searching: ");
            }
        }while(N<=0);
        
        int [] array=new int [N];
        txt = input.nextLine();
        
        for (int i = 0; i<N; i++){
            String []numbers=txt.split(" ");
            number = numbers[i];
            array[i] =  Integer.parseInt(numbers[i]);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        
        if(K>=array[0]&&K<=array[N-1]){
            
            for (int i = 0; i<N; i++){
                if (K==array[i]){
                    System.out.println("Index: "+i);
                }
                if(K>array[i]&&K<array[i+1]){
                    System.out.println("NO.");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("NO.");
            System.exit(0);
        }
    }
}
