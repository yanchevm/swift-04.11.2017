package task04;

import java.util.Scanner;

public class Task4a_StringWoVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			switch (text.charAt(i)) {
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U': result += ""; break;
				default: result += text.charAt(i); break;
			}
		}
		
		System.out.println(result);
	}
}
