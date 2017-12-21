import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Number = scanner.nextLine();
        char firstDigit = Number.charAt(0); //Милен: БРАВО!
        System.out.println(firstDigit);

    }
}
