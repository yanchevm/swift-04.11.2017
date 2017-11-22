import java.util.Scanner;


public class Task4_InchToCm {
    public static void main(String[] args) {
	// Милен: Браво за системния вход!
        Scanner scanner = new Scanner(System.in);
       // double Inch = Double.parseDouble(scanner.nextLine()); // Милен: Разгледай методите на скенера :)
    //double Centimeter = Inch * 2.54; // Милен: Числото '2.54' не се променя. Какво можем да направим при това положение ?
        //System.out.println(Centimeter);

        double Inch = scanner.nextDouble()*2.54;
        System.out.println(Inch);
    }
}
