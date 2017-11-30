import java.util.Scanner;

public class Task3b_PrintZFigure {
    static String repeatString(String toRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + toRepeat;
        }
        return text;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        System.out.print(repeatString("* ",N));
        System.out.println();

        for (int j = 1; j <= N - 2; j++) {

            System.out.print(repeatString("  ", N-j-1));
            System.out.print("*");
            System.out.print(repeatString("  ", N+j+1));

            System.out.println();
        }

        System.out.print(repeatString("* ",N));
    }
}
