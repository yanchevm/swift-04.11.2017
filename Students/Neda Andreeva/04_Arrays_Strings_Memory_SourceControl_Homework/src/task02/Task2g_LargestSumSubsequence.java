package task02;

import java.util.Scanner;

public class Task2g_LargestSumSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		if (number <= 0) {
			System.err.println("ERROR! You must enter a positive number!");
		} else {
			System.out.println("Please, enter a sequence of numbers: ");
			int[] arr = new int[number];
			for (int i = 0; i < number; i++) {
				arr[i] = sc.nextInt();
			}
			
			int largestSumSequencePositionStart = 0;
			int countElementsInLargestSequence = 0;
			int largestSum = 0;
			
			int currentSumSequencePositionStart = 0;
			int countElementsInCurrentSequence = 0;
			int currentSum = 0;
			
			for (int i = 0; i < number; i++) {
				currentSum = 0;
				
				for (int j = i; j < number; j++) {
					currentSum += arr[j];
					
					if (currentSum > largestSum) {
						largestSumSequencePositionStart = i;
						countElementsInLargestSequence = j + 1;
						largestSum = currentSum;
					}
				}
			}
			
			for (int i = largestSumSequencePositionStart; i < countElementsInLargestSequence; i++ ) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
