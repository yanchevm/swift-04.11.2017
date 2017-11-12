package task02;

import java.util.Scanner;
/**
 * Created by neda.andreeva on 11/06/2017.
 */
public class Task2_LeapYear {
    public static void main(String[] args) {
        //Милен: Използваш систем врох за да четеш годината - БРАВО!
        Scanner scan = new Scanner(System.in);

        short year = scan.nextShort(); //Милен: Използваш подходящ тип - БРАВО!
        boolean isLeapYear = false;

        // Милен:
        // Какво би станало ако потребителя въведе невалидна година ?
        // Примерно: -40 или 0
        if (year % 4 == 0) {
            // Има ли начин да оптимизираш if конструкцията ?
            // Можеш ли да използваш някой от логическите опеартори ?
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
            else {
                isLeapYear = true;
            }
        }

        System.out.println(isLeapYear);
    }
}
