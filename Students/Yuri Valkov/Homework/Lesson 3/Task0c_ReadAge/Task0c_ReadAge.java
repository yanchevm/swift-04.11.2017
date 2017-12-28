package homework.homework2.Task0c_ReadAge;
import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
            int age = sc.nextInt(); //Милен: Отново, няма нужда да бъдат изместени
            if (age >= 18) {
                System.out.println("You are adult");
            }
            else {
                System.out.println("You are underage");
                }
            }
    }

