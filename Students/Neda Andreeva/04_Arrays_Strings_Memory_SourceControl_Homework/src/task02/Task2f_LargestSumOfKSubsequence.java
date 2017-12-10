package task02;

import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
                //Милен: Избягвай да пишеш толкова големи if-else конструкции.
                // Тук при положение, че имаш грешка, можеш направо да разпечаташ съобщението и да напишеш return
                // По този начин, няма да имаш толкова голям else :)
		if (number <= 0) {
			System.err.println("ERROR! You must enter a positive number!");
		} else {
			System.out.print("Please, enter a positive number lower than yur previous number: ");
			int k = sc.nextInt();
			if (k <= 0 || k > number) {
				System.err.println("ERROR! Your number must be between 0 and your previous number!");
			}
			else {
				System.out.println("Please, enter a sequence of numbers: ");
				int[] arr = new int[number];
				for (int i = 0; i < number; i++) {
					arr[i] = sc.nextInt();
				}
				
				int currentSum = 0;
				
				int largestSum = 0;
				int largestSumPositionStart = 0;
				
				for (int i = 0; i < (number - k); i++) {
					currentSum = 0;
					for (int j = i; j < (i + 5); j++) {
						currentSum += arr[j];
					}
					
					if (currentSum > largestSum) {
						largestSum = currentSum;
						largestSumPositionStart = i;
					}
				}
				
				for (int i = largestSumPositionStart; i < (largestSumPositionStart + k); i++) {
					System.out.print(arr[i] + " ");
				}
			}
			
			
		}
	}
}
