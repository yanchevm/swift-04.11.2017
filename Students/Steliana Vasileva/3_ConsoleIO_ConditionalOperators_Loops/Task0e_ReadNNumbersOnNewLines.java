import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfDigits = Integer.parseInt(sc.nextLine()); //Милен: Сканера има метод който ще свърши това вместо теб - nextInt(); Връща направо число :)

        int printNumber = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            int number = Integer.parseInt(sc.nextLine()); //Милен: Същото и тук.

        }

        for (int i = 0; i < numberOfDigits; i++) {


            System.out.printf("%d" + " ", printNumber);


        }

    }
}
