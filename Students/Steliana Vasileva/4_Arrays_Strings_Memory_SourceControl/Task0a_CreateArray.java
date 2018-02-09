package src;
import java.util.Scanner;

public class Task0a_CreateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] newIntArray = { 5, 9, 11, 3, 6, 4, 7};

        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println(newIntArray[i]);
        }
    }
}
