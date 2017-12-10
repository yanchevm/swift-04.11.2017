package task00;

import java.util.Scanner;

public class Task0c_PrintString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
		}
	}
}
