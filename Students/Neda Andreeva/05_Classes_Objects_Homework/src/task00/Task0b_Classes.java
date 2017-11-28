package task00;

import java.util.Scanner;

public class Task0b_Classes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the car's brand: ");
		String brand = sc.next();
		
		System.out.print("Please enter the car's model: ");
		String model = sc.next();
		
		System.out.print("Please enter the car's horse power: ");
		short horsePower = sc.nextShort();
		
		System.out.print("Please enter the car's year of manufacture: ");
		short year = sc.nextShort();
		
		Car myCar = new Car();
		myCar.setBrand(brand);
		myCar.setModel(model);
		myCar.setHorsePower(horsePower);
		myCar.setYear(year);
		System.out.println(myCar.insuranceCategory());
	}
}
