package task04;

import java.util.Scanner;

public class Teak4d_SumOfNumbersInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		int sum = 0;
		int currentNumber = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 48 && text.charAt(i) <= 57) {
				int digit = text.charAt(i) - 48;
				currentNumber = (currentNumber * 10) + digit;
				
				if (i == (text.length() - 1)) {
					sum += currentNumber;
				}
			}
			else {
				sum += currentNumber;
				currentNumber = 0;
			}
		}
		
		System.out.println(sum);
	}
}
