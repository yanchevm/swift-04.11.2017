package Homework.HWLecture4.Task0;
import java.util.Scanner;
public class Task0c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' ')
                System.out.println(str.charAt(i));

        }
    }
}
