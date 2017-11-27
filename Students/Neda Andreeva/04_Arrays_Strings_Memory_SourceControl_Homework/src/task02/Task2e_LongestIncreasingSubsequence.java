package task02;

import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
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
			
			int longestSequencePositionStart = 0;
			int longestSequencePositionEnd = 0;
			int longestSequenceCounter = 0;
			
			int currentSequencePositionStart = 0;
			int currentSequencePositionEnd = 0;
			int currentSequenceCounter = 0;
			
			for (int i = 1; i < number; i++) {
				if (arr[i - 1] < arr[i]) {
					currentSequencePositionEnd = i;
					currentSequenceCounter++;
				}
				else if (arr[i - 1] >= arr[i]) {
					if (longestSequenceCounter < currentSequenceCounter) {
						longestSequenceCounter = currentSequenceCounter;
						longestSequencePositionStart = currentSequencePositionStart;
						longestSequencePositionEnd = currentSequencePositionEnd;
					}
					currentSequenceCounter = 0;
					currentSequencePositionEnd = i;
					currentSequencePositionStart = i;
				}
			}
			
			for (int i = longestSequencePositionStart; i <= longestSequencePositionEnd; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
