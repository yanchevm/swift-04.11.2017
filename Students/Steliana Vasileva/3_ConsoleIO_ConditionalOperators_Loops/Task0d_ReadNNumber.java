import java.util.Scanner;

public class Task0d_ReadNNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfDigits = scanner.nextInt();
        for(int i=0; i<numberOfDigits; i++ ){
            int Number = scanner.nextInt();
            System.out.println(Number);
        }



    }
}
