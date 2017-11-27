package task03;

import java.util.Scanner;

public class Task3f_LongestCommonSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text1 = sc.next();
		
		System.out.println("Please, enter your text: ");
		String text2 = sc.next();
		
		int maxLenght = 0;
		int startPosition = 0;
		int endPosition = 0;
		for (int i = 0; i < text1.length() - 1; i++) {
			for (int j = i + 1; j < text1.length(); j++) {
				String currentString = text1.substring(i, j);
				
				if (text2.contains(currentString)) {
					if (maxLenght < currentString.length()) {
						maxLenght = currentString.length();
						startPosition = i;
						endPosition = j;
					}
				}
			}
		}
		
		for (int i = startPosition; i < endPosition; i++) {
			System.out.print(text1.charAt(i));
		}
	}
}
