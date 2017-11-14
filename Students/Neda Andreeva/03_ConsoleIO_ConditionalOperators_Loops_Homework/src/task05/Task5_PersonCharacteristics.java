package task05;

import java.time.Year;
import java.util.Scanner;

public class Task5_PersonCharacteristics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		while (number <= 0) {
			System.err.print("ERROR! Please, enter a valid positive number: ");
			number = sc.nextInt();
		}
		
		for (int i = 0; i < number; i++) {
			System.out.print("Please, enter the person's first name: ");
			String firstName = sc.next();
			while (firstName.equals("")) {
				System.err.print("ERROR! Please, enter a valid first name: ");
				firstName = sc.next();
			}
			
			System.out.print("Please, enter the person's last name: ");
			String lastName = sc.next();
			while (lastName.equals("")) {
				System.err.print("ERROR! Please, enter a valid last name: ");
				lastName = sc.next();
			}
			
			System.out.print("Please, enter the person's birth year: ");
			short birthYear = sc.nextShort();
			int currentYear = Year.now().getValue();
			byte age = (byte) (currentYear - birthYear);
			while (birthYear <= 0 || birthYear >= currentYear) {
				System.err.print("ERROR! Please, enter a valid birth year: ");
				birthYear = sc.nextByte();
				age = (byte) (currentYear - birthYear);
			}
			
			System.out.print("Please, enter the person's weight: ");
			float weight = sc.nextFloat();
			while (weight <= 0) {
				System.err.print("ERROR! Please, enter a valid weight: ");
				weight = sc.nextFloat();
			}
			
			System.out.print("Please, enter the person's height: ");
			float height = sc.nextFloat();
			while (height <= 0) {
				System.err.print("ERROR! Please, enter a valid height: ");
				height = sc.nextFloat();
			}
			
			System.out.print("Please, enter the person's profession: ");
			String profession = sc.next();
			while (profession.equals("")) {
				System.err.print("ERROR! Please, enter a valid profession: ");
				profession = sc.next();
			}
			
			System.out.printf(firstName + " " + lastName + " is %d years old. He mas born in %d. His weight is %.2f and he is %.2f cm tall. He is a " + profession, age, birthYear, weight, height);
			if (age < 18) {
				System.out.println("He is under-aged.");
			}
			else {
				System.out.println();
			}
		}
	}
}
