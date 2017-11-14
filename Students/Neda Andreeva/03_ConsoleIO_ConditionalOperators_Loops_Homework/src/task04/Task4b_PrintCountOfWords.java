package task04;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		byte result = 0;
		for (int i = 0; i < text.length() - 1; i++) {
			if ((text.charAt(i) >= 65 && text.charAt(i) <= 90) ||
				(text.charAt(i) >= 97 && text.charAt(i) <= 122)) {
				if ((text.charAt(i+1) >= 65 && text.charAt(i+1) <= 90) ||
					(text.charAt(i+1) >= 97 && text.charAt(i+1) <= 122)) {
					if (i + 1 == text.length() - 1) {
						result++;
					}
				}
				else {
					result++;
				}
			}
			else {
				if ((text.charAt(i+1) >= 65 && text.charAt(i+1) <= 90) ||
					(text.charAt(i+1) >= 97 && text.charAt(i+1) <= 122)) {
					if (i + 1 == text.length() - 1) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
}
