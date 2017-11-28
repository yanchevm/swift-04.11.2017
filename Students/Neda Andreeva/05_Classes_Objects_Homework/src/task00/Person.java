package task00;

public class Person {
	private String name;
	private byte age;
	
	Person() {
		this.name = "No name";
		this.age = (byte) -1;
	}
	
	Person(String name) {
		if (name.matches("[a-zA-Z]*")) {
			this.name = name;
		}
		else {
			System.err.println("ERROR! Incorrect input! Name must contains only letters!");
		}
		this.age = (byte) -1;
	}
	
	Person(String name, byte age) {
		if (name.matches("[a-zA-Z]*")) {
			this.name = name;
		}
		else {
			System.err.println("ERROR! Incorrect input! Name must contains only letters!");
		}
		if (age > 0) {
			this.age = age;
		}
		else {
			System.err.println("ERROR! Incorrect input! Age must be a positive number!");
		}
	}
	
//	getters
	protected String getName() {
		return this.name;
	}
	
	protected byte getAge() {
		return this.age;
	}
	
//	setters
	protected void setName(String name) {
		if (name.matches("[a-zA-Z]*")) {
			this.name = name;
		}
		else {
			System.err.println("ERROR! Incorrect input! Name must contains only letters!");
		}
	}
	
	protected void setAge(byte age) {
		if (age > 0) {
			this.age = age;
		}
		else {
			System.err.println("ERROR! Incorrect input! Age must be a positive number!");
		}
	}
	
	protected String whoAmI() {
		String message = "";
		
		if (this.name.equals("No name")) {
			message = "I am John Doe!";
		}
		else if (this.age == (byte) -1) {
			message = "Hello, I am " + this.name;
		}
		else {
			message = "Hello, I am " + this.name + ". I am " + this.age + " years old!";
		}
		
		return message;
	}
}
