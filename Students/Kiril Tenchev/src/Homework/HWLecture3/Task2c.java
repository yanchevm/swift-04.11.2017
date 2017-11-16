package Homework.HWLecture3;
import java.util.Scanner;
public class Task2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int size = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String []nums = input.split(" ");

        if(nums.length != size) {
            System.out.println("Illegal number of elements");
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if(Integer.parseInt(nums[i]) % 2 == 0) {
                    System.out.print(nums[i] + " ");
                }
            }
        }
    }
}
