package matrix;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        int sum1=0,sum2,N;
        boolean flag=true;
         do{
            System.out.println("Enter number of entries: ");
            N = input.nextInt();
        }while(N<=0);
        int[] array = new int [N];
        
        System.out.println("Enter numbers: ");
        for(int i = 0; i <N; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0; i <N; i++){
            sum1+=array[i];
            sum2 =0;
            for(int k = i+1;k<N;k++){
                sum2+=array[k];
            }
            //System.out.println(sum1);
            //System.out.println(sum2);
            if (sum1 == sum2){
                System.out.println(i);
                flag =true;
            }
            else{
                flag = false;
            }
        }
        if(flag == false){
            System.out.println("NO.");
        }
    }
    
}
