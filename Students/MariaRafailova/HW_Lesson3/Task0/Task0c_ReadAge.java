package Task0;

import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age: ");
        int years = sc.nextInt();
	
	// Милен: Хубаво е тук да слагаш и една проверка дали годините въведени от потребителя са валидни
        if(years >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }
    }
}
