package task03;

import java.util.Scanner;

public class Task3a_IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		
		int numberOfCharacters = text.length();
		boolean isPalindrome = true;
		
		for (int i = 0; i <= (numberOfCharacters / 2); i++) {
			if (text.charAt(numberOfCharacters - i - 1) != text.charAt(i)) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println(isPalindrome);
	}
}
