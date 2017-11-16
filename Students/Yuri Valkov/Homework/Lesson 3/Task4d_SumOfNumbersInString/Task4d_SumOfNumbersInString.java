package Lesson3.Homework.Task4d_SumOfNumbersInString;
import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your text here: ");
        String text = sc.nextLine();
        String[] arr = text.split(" ");
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
           boolean num = false;
              switch (arr[i].charAt(0)){

                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    num = true; break;
            }
            if (num) {
              sum += Integer.parseInt(arr[i]);
              }
        }
        System.out.println(sum);
    }
}
