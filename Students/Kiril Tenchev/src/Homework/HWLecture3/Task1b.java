package Homework.HWLecture3;
import java.util.Scanner;
public class Task1b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, reverse = 0;
        System.out.print("Enter the number to reverse: ");
        num = sc.nextInt();

        // Милен: БРАВО! Много добре си се досетил.
        while( num != 0 ) {
            reverse *=  10;
            reverse +=  num%10;
            num /=10;
        }
        System.out.println("Reverse of entered number is "+reverse);
    }
}
