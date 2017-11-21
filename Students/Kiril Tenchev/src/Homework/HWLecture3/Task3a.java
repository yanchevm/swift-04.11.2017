package Homework.HWLecture3;
import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int input = Integer.parseInt(sc.nextLine());

        //Милен: БРАВО, алгоритъма ти е правилен
        for (int i = 0; i <input ; i++) {
            for (int j = 0; j <input ; j++) {
                if(i==0||i+1==input){
                    System.out.print("* ");
                }
                else if(j==0||j+1==input){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
