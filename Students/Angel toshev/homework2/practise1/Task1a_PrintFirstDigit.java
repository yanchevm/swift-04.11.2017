package homework.homework2.practise1;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
	//Милен: Интересен подход :) Какво ще стане ако числото е много голямо ? 
        // Защо не пробваш с % ?        
	if (num<=99){

            System.out.println(num/10);
        }else if (num>99&&num<=999){

            System.out.println(num/100);
        }else if (num>999&&num<=9999){

            System.out.println(num/1000);
        }else if (num>9999&&num<=99999){

            System.out.println(num/10000);
        }

    }
}
