package Homework.HWLecture3;
import java.util.Scanner;
public class Task4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence: ");
        String str =sc.nextLine();
        int count=0;
        for (int i = 0; i <=str.length()- 1; i++) {
            if(str.charAt(i)==' '){
                count++;
            }
            else if(str.charAt(i)==','){
                count++;
            }
        }
        System.out.println("Words number: "+count);
    }
}
