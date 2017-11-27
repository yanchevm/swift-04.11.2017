package task01;

import java.util.Scanner;

public class Task1b_PrintMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		if (number <= 0) {
			System.err.println("ERROR! Please enter a positive number!");
		}
		else {
			int[][] arr = new int[number][number];
			
			int value = 1;
			
			for (int col = 0; col < number; col++) {
				if (col % 2 == 0) {
					for (int row = 0; row < number; row++) {
						arr[row][col] = value;
						value++;
					}
				}
				else {
					for (int row = number - 1; row >= 0; row--) {
						arr[row][col] = value;
						value++;
					}
				}
			}
			
			for (int row = 0; row < number; row++) {
				for (int col = 0; col < number; col++) {
					System.out.printf("%4d", arr[row][col]);
				}
				System.out.println();
			}
		}
	}
}
