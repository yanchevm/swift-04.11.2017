import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String Number = scanner.nextLine();

        for (int i = Number.length(); i >= 1; i--) {

            System.out.print(Number.charAt(i-1));

        }
    }
}
