package Homework.HWLecture3;
import java.util.Scanner;
public class Task0c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        if(age<0){
            System.out.println("Incorrect input!");
        }
        else if(age>=0&&age<18){
            System.out.println("Underage");
        }
        else{
            System.out.println("Adult");
        }
    }
}
