package Homework.HWLecture3;
import java.util.Scanner;
public class Task3b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input ; j++) {
                if(i==0||i==input-1){
                    System.out.print("* ");
                }
                else if(j==input||j==input-1-i){
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
