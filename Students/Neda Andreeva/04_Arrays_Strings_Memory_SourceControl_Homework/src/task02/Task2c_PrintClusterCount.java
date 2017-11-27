package task02;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
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
			
			int clusterCounter = 0;
			int currentClusterElementsCount = 1;
			int currentElement = arr[0];
			
			for (int i = 1; i < number; i++) {
				if (i < number - 1) {
					if (currentElement == arr[i]) {
						currentClusterElementsCount++;
					} else {
						if (currentClusterElementsCount > 1) {
							clusterCounter++;
						}
						currentClusterElementsCount = 1;
					}
				}
				else {
					if (currentElement == arr[i]) {
						clusterCounter++;
					}
				}
				currentElement = arr[i];
			}
			
			System.out.print("The number of clusters is: " + clusterCounter);
		}
	}
}
