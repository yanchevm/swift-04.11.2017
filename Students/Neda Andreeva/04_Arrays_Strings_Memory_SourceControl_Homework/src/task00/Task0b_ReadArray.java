package task00;

import java.util.Scanner;

public class Task0b_ReadArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		if (number <= 0) {
			System.err.println("ERROR! You must enter a positive number!");
		}
		else {
			System.out.print("Please, enter a sequence of numbers: ");
			int[] arr = new int[number];
			
			for (int i = 0; i < number; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < number; i++) {
				System.out.print(arr[i]);
				
				if (i < number - 1) {
					System.out.print(", ");
				}
			}
		}
	}
}
