package task02;

import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
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
			
			for (int i = 0; i < number; i++) {
				for (int j = i; j < number; j++) {
					if (arr[i] > arr[j]) {
						arr[i] = arr[i] + arr[j];
						arr[j] = arr[i] - arr[j];
						arr[i] = arr[i] - arr[j];
					}
				}
			}
			
			for (int i = 0; i < number; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
