package task03;

import java.util.Scanner;

public class Task3b_PrintZFigure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number larger than 2: ");
		int number = sc.nextInt();
		if (number <= 2) {
			System.err.println("ERROR! You must enter a positive number larger than 2!");
		}
		else {
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					if (i == 0 || i == (number - 1)) {
						System.out.print("* ");
					}
					else {
						if (j == (number - i - 1)) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}
