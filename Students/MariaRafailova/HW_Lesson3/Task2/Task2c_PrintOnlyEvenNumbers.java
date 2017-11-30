package Task2;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number:  ");
        String num = sc.nextLine(); //Милен: Отново, искаш номер, а използваш nextLine. 

        System.out.println("Please enter "+num +" numbers, separated by space:");
        String str = sc.nextLine();

	// Милен: Тук е добре да направиш една проверка, че въведените стойности от потребителя са наистина толкова колкото е казал в началото.
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i])%2 == 0){
                System.out.print(arr[i]+ " ");
            }
        }


    }
}
