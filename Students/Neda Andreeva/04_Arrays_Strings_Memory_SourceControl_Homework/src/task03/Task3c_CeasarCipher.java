package task03;

import java.util.Scanner;

public class Task3c_CeasarCipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your text: ");
		String text = sc.next();
		
		System.out.println("Encode or Decode: ");
		String procedure = sc.next();
		
		if (procedure.toLowerCase().equals("encode")) {
			encode(text);
		}
		else if (procedure.toLowerCase().equals("decode")) {
			decode(text);
		}
		else {
			System.err.println("ERROR! Incorrect input!");
		}
	}
	
	public static void encode(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == (char) 122) {
				System.out.print((char) 97);
			}
			else if (text.charAt(i) == (char) 90) {
				System.out.print((char) 65);
			}
			else {
				System.out.print((char) (((int) text.charAt(i)) + 1));
			}
		}
	}
	
	public static void decode(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == (char) 97) {
				System.out.print((char) 122);
			}
			else if (text.charAt(i) == (char) 65) {
				System.out.print((char) 90);
			}
			else {
				System.out.print((char) (((int) text.charAt(i)) - 1));
			}
		}
	}
}
