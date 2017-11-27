package task02;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		if (number <= 0) {
			System.err.println("ERROR! You must enter a positive number!");
		}
		else {
			System.out.println("Please, enter a sequence of numbers: ");
			int[] arr = new int[number];
			for (int i = 0; i < number; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = 0;
			for (int i = 0; i < number; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			
			System.out.print("The largest number is " + max);
		}
	}
}
