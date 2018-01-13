package homework.homework2.practise4;

import java.util.Scanner;

/**
 * Created by Admin on 1.12.2017 г..
 */
public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text!!!");
        String txt = sc.nextLine();
        String arr[] = txt.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isNum = false;
            switch (arr[i].charAt(0)){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
		    //Милен: Това можеше да се оптимизира малко.
		    // Знаеш, че е число, и е от 0 - 9. Защо тук направо не
   		    // го добавиш съм сумата ? Ще си спестиш този isNum флаг :)
                    isNum=true;
                    break;
            }
            if (isNum)
                sum+=Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
