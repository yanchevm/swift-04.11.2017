package task01;

import java.util.Scanner;

public class Task1c_PrintMatrix {
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
			int finalValue = number * number;
			
			int row = 0;
			int col = 0;
			
			while (value <= finalValue) {
				arr[row][col] = value;
				value++;
				
				if (row == 0 && col % 2 != 0) {
					row++;
					col--;
				}
				else if (row == 0 && col % 2 == 0 && col == (number - 1)) {
					row++;
				}
				else if (row == 0 && col % 2 == 0 && col != (number - 1)) {
					col++;
				}
				else if (col == 0 && row % 2 == 0) {
					row--;
					col++;
				}
				else if (col == 0 && row % 2 != 0 && row != (number - 1)) {
					row++;
				}
				else if (col == 0 && row % 2 != 0 && row == (number - 1)) {
					col++;
				}
				else if (row == (number - 1) && col % 2 == 0 && number % 2 != 0) {
					row--;
					col++;
				}
				else if (row == (number - 1) && col % 2 != 0 && number % 2 != 0) {
					col++;
				}
				
				else if (row == (number - 1) && col % 2 != 0 && number % 2 == 0) {
					row--;
					col++;
				}
				else if (row == (number - 1) && col % 2 == 0 && number % 2 == 0) {
					col++;
				}
				else if (col == (number - 1) && row % 2 != 0 && number % 2 == 0) {
					row++;
				}
				else if (col == (number - 1) && row % 2 == 0 && number % 2 == 0) {
					row++;
					col--;
				}
				else if (col == (number - 1) && row % 2 == 0 && number % 2 != 0) {
					row++;
				}
				else if (col == (number - 1) && row % 2 != 0 && number % 2 != 0) {
					row++;
					col--;
				}
				else if ((row % 2 != 0 && col % 2 != 0) || (row % 2 == 0 && col % 2 == 0)) {
					row--;
					col++;
				}
				else if ((row % 2 != 0 && col % 2 == 0) || (row % 2 == 0 && col % 2 != 0)) {
					row++;
					col--;
				}
			}
			
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					System.out.printf("%4d", arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
