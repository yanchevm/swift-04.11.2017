package task04;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
				System.out.println();
			}
		}
	}
}
