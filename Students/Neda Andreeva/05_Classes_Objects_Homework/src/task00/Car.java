package task00;

import java.time.Year;

public class Car {
	private String brand;
	private String model;
	private short horsePower;
	private short year;
	
//	getters
	protected String getBrand() {
		return this.brand;
	}
	
	protected String getModel() {
		return this.model;
	}
	
	protected short getHorsePower() {
		return this.horsePower;
	}
	
	protected short getYear() {
		return this.year;
	}
	
//	setters
	protected void setBrand(String brand) {
		if (brand.matches("[a-zA-Z]*")) {
			this.brand = brand;
		}
		else {
			System.err.println("ERROR! Incorrect input! Brand must contains only letters!");
		}
	}
	
	protected void setModel(String model) {
		if (model.matches("[a-zA-Z0-9]*")) {
			this.model = model;
		}
		else {
			System.err.println("ERROR! Incorrect input! Brand must contains only letters or numbers!");
		}
	}
	
	protected void setHorsePower(short horsePower) {
		if (horsePower > 0) {
			this.horsePower = horsePower;
		}
		else {
			System.err.println("ERROR! Incorrect input! Horse power must be a positive number!");
		}
	}
	
	protected void setYear(short year) {
		short now = (short) Year.now().getValue();
		if (year > 0 && year <= now) {
			this.year = year;
		}
		else {
			System.err.println("ERROR! Incorrect input! Year must be a positive number lower than or equal to the current year!");
		}
	}
	
	protected double insuranceCategory() {
		short now = (short) Year.now().getValue();
		byte age = (byte) (now - this.year);
		double tax = 0.0;
		
		if (age >= 0 && age <= 8) {
			tax = 150.0;
		}
		else if (age > 8 && age <= 15) { //Милен: Имаш ли нужда от проверката age > 8 ? Ако е по-малко, ще стигне ли до тук ?
			tax = 200.0;
		}
		else if (age > 15 && age <= 25) { //Милен: Същото и тук
			tax = 300.0;
		}
		else {
			tax = 500.0;
		}
		
		if (this.horsePower < 80) {
			tax += (tax * 0.2);
		}
		else if (this.horsePower > 140) {
			tax += (tax * 0.45);
		}
		
		return tax;
	}
}