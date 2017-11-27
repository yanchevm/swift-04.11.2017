package task04;

import java.time.Year;
import java.util.Scanner;

public class Task4_PersonalCharacteristics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		while (number <= 0) {
			System.err.print("ERROR! Please, enter a valid positive number: ");
			number = sc.nextInt();
		}
		
		String[] firstNames = new String[number];
		String[] lastNames = new String[number];
		short[] birthYears = new short[number];
		byte[] ages = new byte[number];
		float[] weight = new float[number];
		float[] height = new float[number];
		String[] professions = new String[number];
		char[] genders = new char[number];
		double[] average = new double[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Please, enter the person's first name: ");
			firstNames[i] = sc.next();
			while (firstNames[i].equals("")) {
				System.err.print("ERROR! Please, enter a valid first name: ");
				firstNames[i] = sc.next();
			}
			
			System.out.print("Please, enter the person's last name: ");
			lastNames[i] = sc.next();
			while (lastNames[i].equals("")) {
				System.err.print("ERROR! Please, enter a valid last name: ");
				lastNames[i] = sc.next();
			}
			
			System.out.print("Please, enter the person's birth year: ");
			birthYears[i] = sc.nextShort();
			int currentYear = Year.now().getValue();
			while (birthYears[i] <= 0 || birthYears[i] >= currentYear) {
				System.err.print("ERROR! Please, enter a valid birth year: ");
				birthYears[i] = sc.nextByte();
			}
			
			byte age = (byte) (currentYear - birthYears[i]);
			ages[i] = age;
			
			System.out.print("Please, enter the person's weight: ");
			weight[i] = sc.nextFloat();
			while (weight[i] <= 0) {
				System.err.print("ERROR! Please, enter a valid weight: ");
				weight[i] = sc.nextFloat();
			}
			
			System.out.print("Please, enter the person's height: ");
			height[i] = sc.nextFloat();
			while (height[i] <= 0) {
				System.err.print("ERROR! Please, enter a valid height: ");
				height[i] = sc.nextFloat();
			}
			
			System.out.print("Please, enter the person's profession: ");
			professions[i] = sc.next();
			while (professions[i].equals("")) {
				System.err.print("ERROR! Please, enter a valid profession: ");
				professions[i] = sc.next();
			}
			
			System.out.print("Please, enter the person's gender (m/f): ");
			genders[i] = sc.next().trim().charAt(0);
			while (genders[i] != 77 || genders[i] != 70 || genders[i] != 109 || genders[i] != 102) {
				System.err.println("ERROR! Please, enter a valid gender: ");
				System.out.println(genders[i]);
				genders[i] = sc.next().trim().charAt(0);
			}
			
			double[] grades = new double[4];
			double sum = 0.0;
			System.out.print("Please, enter 4 grades between 2 and 6: ");
			for (int j = 0; j < 4; j++) {
				System.out.print("Please, enter grade number " + j + ": ");
				grades[j] = sc.nextDouble();
				while (grades[j] < 2 || grades[j] > 6) {
					System.err.println("ERROR! Please, enter a valid grade between 2 and 6: ");
					grades[j] = sc.nextDouble();
				}
				sum += grades[i];
			}
			average[i] = sum / 4;
		}
		
		for (int i = 0; i < number; i++) {
			if (genders[i] == 77 || genders[i] == 109) {
				System.out.printf(firstNames[i] + " " + lastNames[i] + " is %d years old. He mas born in %d. His weight is %.2f and he is %.2f cm tall. He is a " + professions[i] + " with an average grade of %.3f", ages[i], birthYears[i], weight[i], height[i], average[i]);
				if (ages[i] < 18) {
					System.out.println("He is under-aged.");
				} else {
					System.out.println();
				}
			}
			else {
				System.out.printf(firstNames[i] + " " + lastNames[i] + " is %d years old. She mas born in %d. Her weight is %.2f and she is %.2f cm tall. She is a " + professions[i] + " with an average grade of %.3f", ages[i], birthYears[i], weight[i], height[i], average[i]);
				if (ages[i] < 18) {
					System.out.println("She is under-aged.");
				} else {
					System.out.println();
				}
			}
		}
	}
}
