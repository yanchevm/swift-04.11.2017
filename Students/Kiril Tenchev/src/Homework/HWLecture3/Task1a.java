package Homework.HWLecture3;
import java.util.Scanner;
public class Task1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number =sc.nextInt(); //Милен: Можеш ли да оптимизираш малко тук ?
                                 // Защо ти е да четеш числото като integer, след това
                                // използваш рапъра на integer само за да го превърнеш в стринг ?
        String str = new Integer(number).toString();
        char c = str.charAt(0);
        System.out.println(c);
    }
}
