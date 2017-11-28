package task02;

import java.util.Scanner;

public class Task2i_FindKInSorted {
	public static int binarySearch(int arr[], int from, int to, int element) {
		if (from < to) {
			int middle = from + ((to - from) / 2);
			
			if (arr[middle] == element) {
//				Element is found
				return middle;
			}
			else if (arr[middle] > element) {
//				Searches in the right side
				return binarySearch(arr, from, (middle - 1), element);
			}
			else {
//				Searches in the left side
				return binarySearch(arr, (middle + 1), to, element);
			}
		}
		else {
//			Element is not present
			return -1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a positive number: ");
		int number = sc.nextInt();
		
		if (number <= 0) {
			System.err.println("ERROR! You must enter a positive number!");
		} else {
			System.out.print("Please, enter a number: ");
			int k = sc.nextInt();
			
			System.out.println("Please, enter a sequence of numbers: ");
			int[] arr = new int[number];
			for (int i = 0; i < number; i++) {
				arr[i] = sc.nextInt();
			}
			
			int position = binarySearch(arr, 0, (number - 1), k);
			
			if (position == -1) {
				System.out.println("NO");
			}
			else {
				System.out.println("The position is: " + position);
			}
		}
	}
}
