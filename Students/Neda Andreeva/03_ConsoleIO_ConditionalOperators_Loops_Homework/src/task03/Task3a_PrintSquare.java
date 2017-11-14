package task03;

import java.util.Scanner;

public class Task3a_PrintSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		if (number <= 0) {
			System.err.println("ERROR! You must enter a positive number!");
		}
		else {
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					if (i == 0 || i == (number - 1)) {
						System.out.print("* ");
					}
					else {
						if (j == 0 || j == (number - 1)) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}
