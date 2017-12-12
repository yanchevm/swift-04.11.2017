package matrix;

import java.util.Scanner;

public class Task2f_LargestSUmOfKSubsequence {
   
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N,k,m=0;
        int sum,sumMax=0;
        String text;
        
        do{
            System.out.println("Enter number of entries and size of subsequence: ");
            text = input.nextLine();
            String[]parts = text.trim().split(" ");
            N = Integer.parseInt(parts[0]);
            k = Integer.parseInt(parts[1]);
        }while(N<=0||N<=k);
        
        int array[];
        array = new int [N];
        System.out.println("Enter numbers: ");
        
        int arr[];
        arr = new int[k];
        for(int i = 0; i <N; i++){
            array[i] = input.nextInt();
        }
        
        for(int i = 0; i <=N-k; i++){
            sum=0;
            for(int j = i; j<k+i; j++){
                sum+=array[j];
            }
            if (sumMax<sum){
                sumMax=sum;
            }
        }
        
        System.out.println(sumMax);
        
        for(int i = 0; i <=N-k; i++){
            sum=0;
            for(int j = i; j<k+i; j++){
                sum+=array[j];
            }
            if (sum ==sumMax){
                for(int j = i; j<k+i; j++){
                    if(m<k){
                        arr[m]=array [j];
                        m++;
                    }
                }
            }
        }
        for(int i =0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}