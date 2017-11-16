package Task4;

import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter some text: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'y':
                case 'Y':
                    System.out.print(""); break;
                    default:
                        System.out.print(str.charAt(i)); break;

            }
        }
    }

}
