package Homework.HWLecture4.Task0;

public class Task0d {
    public static void main(String[] args) {
        int[][] mass=new int[4][4];
        int k=1;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                mass[i][j]=k++;
            }

        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(mass[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
