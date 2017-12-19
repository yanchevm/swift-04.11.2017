package matrix;

import java.util.Scanner;

public class Task2g_LargestSumSubsequence {
    public static void maxSubsequenceSum(int[] X) {
        int sum_start = 0, sum_end = 0, start = 0, end = 0,m=0,M=X.length,count=0;
    int max = X[0];
    int sum = X[0];
    int arr[]=new int[M];
    for (int i = 1; i < X.length; i++) {
        sum = Math.max(X[i], sum + X[i]);
        max = Math.max(max, sum);
    }
    System.out.print("Maximum sum of subsequence:"+ max);
    
     for(int i = 0; i <X.length; i++){
            sum=0;
            for(int j = i; j<X.length; j++){
                sum+=X[j];
            }
            if (sum ==max){
                for(int j = i; j<X.length; j++){
                    if(m<X.length){
                        arr[m]=X[j];
                        m++;
                       count =m; 
                    }
                }
            }
        }
     
     System.out.println();
     System.out.print("Longest subsequence: ");
        for(int i =0;i<m;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    System.out.println("Count of numbers in longest sequence: "+count);
}
    
    
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int [] arr;
        int N;
         do{
            System.out.println("Enter number of entries: ");
            N = input.nextInt();
        }while(N<=0);
        
        arr = new int[N];
        System.out.println("Enter numbers: ");
        
        for(int i = 0; i <N; i++){
            arr[i] = input.nextInt();
        }
        //int[] arr ={ -5, 7, -8,50, -5,60,70,10,15,-1,21,40};
        //int[] arr = {5, 15, -30, 10, -5, 40, 10};

    maxSubsequenceSum(arr);
    }  
}
