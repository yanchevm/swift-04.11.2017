package Homework.HWLecture9;
import java.util.Scanner;
public class Task0_NumberNotANumber {

    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String number = "";
        System.out.println("Enter number: ");

        while (!number.equals("END")){ // Милен: Тук може да използваш do-while! Ще ти бъде по-лесно и ще спестиш тази гимнастика която се опитваш да направиш :)
            number = sc.nextLine();

            if(number.equals("END")){return;} // Милен: Тук предполагам, че си искал да напишеш break;

            try {
                Integer.parseInt(number);
                System.out.println(BLUE + "Number." + RESET);
                System.out.println("Enter number: ");
            }
            catch (NumberFormatException e) {
                System.out.println("Enter number: ");
                System.err.println("Not a number."); // Това трябва да бъде преди "Enter number."
            }
        }//когато разделя със спейс изкарва съобщението преди съобщението за грешка
        // и не знам как да го оправя
    }
}
