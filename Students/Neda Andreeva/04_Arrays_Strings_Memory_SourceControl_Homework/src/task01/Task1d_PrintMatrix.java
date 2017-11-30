package task01;

import java.util.Scanner;

public class Task1d_PrintMatrix {
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
			
			int numberOfSquares = (number / 2);
			for (int counter = 0; counter < numberOfSquares; counter++) {
				int row = counter;
				int col = counter;
				
				while (col < (number - counter - 1)) {
					arr[row][col] = value;
					value++;
					col++;
				}
				
				while (row < (number - counter - 1)) {
					arr[row][col] = value;
					value++;
					row++;
				}
				
				while (col > counter) {
					arr[row][col] = value;
					value++;
					col--;
				}
				
				while (row > counter) {
					arr[row][col] = value;
					value++;
					row--;
				}
				
				if (value == number * number && number % 2 != 0) {
					arr[numberOfSquares][numberOfSquares] = value;
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
