package mypack;

import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String [] args){
        byte length;
      System.out.println("Enter side length of the square: ");  
      Scanner input = new Scanner(System.in);
      length = input.nextByte();
      char symbol = '*';
      char [][] square;
      square  = new char[length][length];
	//Милен: Алгоритъма е правилен, браво!
      for(int i =0; i<length; i++){
          if(i==0||i==length-1){
              
          
          for(int j =0; j<length; j++){
             square[i][j] = symbol; 
          }}
          else{
              
              for(int j =0; j<length; j++){
             if(j==0||j==length-1){
          square[i][j] = symbol; 
          }else{
                 square[i][j] = ' ';
             }
      }
    }
      }
    for(int i =0; i<length;i++){
        for(int j = 0; j<length;j++){
            System.out.print(square[i][j]+" ");
        }
        System.out.println();
    }
    
    }}
