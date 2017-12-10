package task02;

import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		if (number <= 0) {
			System.err.println("ERROR! You must enter a positive number!");
		} else {
			System.out.println("Please, enter a sequence of numbers: ");
			int[] arr = new int[number];
			for (int i = 0; i < number; i++) {
				arr[i] = sc.nextInt();
			}
			
			int counter = 0;
			
			for (int i = 0; i < number; i++) {
				int currentNumber = arr[i];
				for (int j = 0; j < number; j++) {
					if (currentNumber == arr[j]) {
						counter++;
					}
				}
				
				if (counter % 2 == 1) {
					System.out.println("The lonely number is: " + currentNumber);
					break;
				}
				else {
					counter = 0;
				}
			}
		}
	}
}
