package Homework.HWLecture3;
import java.util.Scanner;
public class Task4c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentences:");
        String str=sc.nextLine();
        String[] sSentence = str.split("[\\.\\?\\!]");
        for (int i = 0; i <= sSentence.length-1 ; i++) {
            System.out.println(sSentence[i]);

        }

    }
}
