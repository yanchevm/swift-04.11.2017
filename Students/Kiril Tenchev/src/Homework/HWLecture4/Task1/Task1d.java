package Homework.HWLecture4.Task1;

import java.util.Scanner;

public class Task1d {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int[][] mass=new int[size][size];
        int p=1;
        int rowStart=0;
        int rowLength=mass.length-1;
        int colStart=0;
        int colLength=mass[0].length-1;
        //Милен: Супер!
        while(rowStart<=rowLength&&colStart<=colLength){
            for (int i = rowStart; i <=colLength ; i++) {
                mass[rowStart][i]=p++;
            }
            for (int i = rowStart+1; i <=rowLength ; i++) {
                mass[i][colLength]=p++;
            }
           if(rowStart+1<=rowLength){
               for (int i = colLength-1; i >=colStart ; i--) {
                   mass[rowLength][i]=p++;
               }
           }
           if(colStart+1<=colLength){
               for (int i = rowLength-1; i >rowStart ; i--) {
                   mass[i][colStart]=p++;

               }
           }
            rowStart++;
            rowLength--;
            colStart++;
            colLength--;
        }
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print(mass[i][j]+" | ");
            }
            System.out.println();
        }

    }
}
