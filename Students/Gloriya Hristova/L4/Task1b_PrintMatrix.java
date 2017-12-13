package matrix;

import java.util.Scanner;

public class Task1b_PrintMatrix {
     public static void main(String[] args){
        int a = 1;
        int N;
        Scanner input = new Scanner(System.in);
         do{   

         System.out.println("Enter number of square matrix rows and columns: ");
        N = input.nextInt();
        }while(N<=0);
      int array[][] = new int[N][N];
      for(int j = 0; j<N; j++){
          if(j==0||(j%2==0)){
          for(int i=0; i<N; i++){
             
                 array [i][j] = a;
             
              a++;
          }}else{ for (int i=N-1;i>=0;i--){
               array [i][j] = a;
             
              a++;
          }
          }
      }
      for(int i = 0; i<N; i++){
          for(int j=0; j<N; j++){
              System.out.print(array[i][j]+"\t");
          }System.out.println();
      }
     }
}
