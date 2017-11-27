package Task0b_ReadArray.Task0c_PrintString;
import java.util.Scanner;


public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter text: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length() ; i++) {
            System.out.println(text.charAt(i));

        }
    }
    }
