package task03;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		
		for (int i = 97; i <= 122; i++) {
			int counter = 0;
			char currentLetter = (char) i;
			
			for (int j = 0; j < text.length(); j++) {
				if (text.toLowerCase().charAt(j) == currentLetter) {
					counter++;
				}
			}
			
			if (counter != 0) {
				System.out.printf("(%c), %d", currentLetter, counter);
				System.out.println();
			}
		}
	}
}
