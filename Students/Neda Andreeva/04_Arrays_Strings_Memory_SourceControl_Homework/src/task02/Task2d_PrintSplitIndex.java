package task02;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {
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
			
			int currentPosition = 0;
			while (currentPosition < number) {
				int leftSum = 0;
				int rightSum = 0;
				for (int i = 0; i < number; i++) {
					if (i <= currentPosition) {
						leftSum += arr[i];
					}
					else {
						rightSum += arr[i];
					}
				}
				
				if (leftSum == rightSum) {
					System.out.println(currentPosition);
					break;
				}
				else {
					if (currentPosition == number - 1) {
						System.out.println("NO");
						break;
					}
					else {
						currentPosition++;
					}
				}
			}
		}
	}
}
