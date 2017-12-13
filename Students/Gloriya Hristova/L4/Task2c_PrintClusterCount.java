package matrix;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        int n;
        int countMax = 0;
        int clusterNumber;
        int clusterCount=0;
        int num=0;
        int counter;
        
        do{
            System.out.println("Enter number of entries: ");
            n = input.nextInt();
        }while(n<=0);
        int[] array = new int [n];
        
        System.out.println("Enter numbers: ");
        for(int i = 0; i <n; i++){
            array[i] = input.nextInt();
        }
        
        for(int j = 0; j <n; j++){
            counter=1;
            num = array[j];
            
            for(int k =j+1;k<n;k++){
                if(array[j]==array[k]){
                    counter++;
                    j++;
                    if(j>=n){
                        break;
                    }
                }
            }
            if(counter>1){
                clusterCount++;
            }
            if(counter>countMax){
                countMax=counter;
                clusterNumber=array[j];
            }
            //System.out.println("Number "+num+" is represented "+counter+"times.");
        }
        System.out.println(clusterCount);
    }
}
