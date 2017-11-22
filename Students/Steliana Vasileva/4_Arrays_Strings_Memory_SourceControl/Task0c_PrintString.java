import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String newString = sc.nextLine();

        char [] newCharArray = newString.toCharArray();

        for (int i = 0; i < newCharArray.length; i++) {
            System.out.println(newCharArray[i]);
        }


    }
}
