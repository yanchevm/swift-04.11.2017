import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Solution1:
        // String numberTwo = Integer.toBinaryString(number);
        //System.out.println(numberTwo);

        int newNumber = 0;
        int newNumber1 = 0;

        int number1 = number;
        int number2 = number;

        int counter = 0;
        int counter1 = 0;

        do {
            newNumber = number1 / 2;
            counter++;
            number1 = newNumber;

        } while (number1 >= 1);

        int[] newIntArray = new int[counter];

        for (int i = 0; i < counter; i++) {
            newNumber = number / 2;
            newIntArray[i] = number % 2;
            number = newNumber;

        }
        for (int i = newIntArray.length - 1; i >= 0; i--) {
            System.out.print(newIntArray[i]);

        }
        System.out.println();

        do {
            newNumber1 = number2 / 16;
            counter1++;
            number2 = newNumber1;

        } while (number2%16>=0);

        int[] newIntArray1 = new int[counter1];

        for (int i = 0; i < counter1; i++) {
            newNumber1 = number2 / 16;
            newIntArray1[i] = number2 % 16;
            number2 = newNumber1;
        }
        for (int i = newIntArray1.length - 1; i >= 0; i--) {
                System.out.print(newIntArray1[i]);
            }
        }

    }












