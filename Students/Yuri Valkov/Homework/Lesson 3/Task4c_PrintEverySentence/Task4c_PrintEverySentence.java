package Lesson3.Homework.Task4c_PrintEverySentence;
import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        String[] arr = text.split("[.?!]"); //Милен: БРАВО!
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].trim());
        }

    }
}