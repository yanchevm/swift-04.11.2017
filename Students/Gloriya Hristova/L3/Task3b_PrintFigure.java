package mypack;

import java.util.Scanner;


public class Task3b_PrintFigure {
     public static void main(String [] args){
        byte size;
      System.out.println("Enter the size of the figure: ");  
      Scanner input = new Scanner(System.in);
      size = input.nextByte();
      char symbol = '*';
      int z = size-2;
      char [][] figure;
      figure  = new char[size][size];
      for(int i =0; i<size; i++){
          if(i==0||i==size-1){
             
          for(int j =0; j<size; j++){
             figure[i][j] = symbol; 
          }}
          else{
              for(int j =0; j<size; j++){
             if(j==z){
          figure[i][j] = symbol; 
          z--;
          }else{
                 figure[i][j] = ' ';
             }
      }
    }
      }
    for(int i =0; i<size;i++){
        for(int j = 0; j<size;j++){
            System.out.print(figure[i][j]+" ");
        }
        System.out.println();}
    }
}
