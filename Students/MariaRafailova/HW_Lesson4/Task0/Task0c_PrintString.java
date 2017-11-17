package Task0;

import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter some text: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) != ' '){
                System.out.println(input.charAt(i));
            }
        }

    }
}
