package task03;

import java.util.Scanner;

public class Task3c_PrintChristmasTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number larger than 2: ");
		int number = sc.nextInt();
		if (number <= 2) {
			System.err.println("ERROR! You must enter a positive number larger than 2!");
		}
		else {
			int rowsInTheTree = number - 2;
			int columnsInTheTree = (2 * (number - 2)) + 1;
			
			// Crown of the tree
			for (int i = 0; i < rowsInTheTree; i++) {
				int numberOfSpaces = (columnsInTheTree / 2) - i;
				int numberOfStars = columnsInTheTree - (numberOfSpaces * 2);
				
				for (int j = 0; j < numberOfSpaces - 1; j++) {
					System.out.print("  ");
				}
				
				for (int j = 0; j < numberOfStars; j++) {
					System.out.print("* ");
				}
				
				for (int j = 0; j < numberOfSpaces - 1; j++) {
					System.out.print("  ");
				}
				
				System.out.println();
			}
			
			// Stem of the tree
			for (int i = 0; i < columnsInTheTree / 2 - 1; i++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			System.out.println();
			
			// Stand of the tree
			for (int i = 0; i < columnsInTheTree / 2 - 2; i++) {
				System.out.print("  ");
			}
			System.out.print("* * * ");
			System.out.println();
		}
	}
}
