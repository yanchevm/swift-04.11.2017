package task00;

import java.util.Scanner;

public class Task0a_Classes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the person's name: ");
		String name = sc.next();
		
		System.out.print("Please enter the person's age: ");
		byte age = sc.nextByte();
		
		Person me = new Person();
		me.setName("Boyan");
		System.out.println(me.whoAmI());
		
		Person alsoMe = new Person(name);
		alsoMe.setAge((byte) 15);
		System.out.println(alsoMe.whoAmI());
		
		Person meAgain = new Person(name, age);
		System.out.println(meAgain.whoAmI());
	}
}
