package Homework.HWLecture5.Task0b;

import java.time.Year;

public class Car {
    private String brand;
    private String model;
    private int horsePower;
    private int year;

   public Car(String brandValue,String modelValue,int horsePowerValue,int yearValue){
       brand=brandValue;
       model= modelValue;
       horsePower=horsePowerValue;
       year=yearValue;

    }

    public int insuranceCategory(){
        int age = Year.now().getValue() - year; // Милен: БРАВО!
        if (age>=0) {
            if (age <= 8) {
                return 1;
            } else if (age <= 15) {
                return 2;
            } else if ( age <= 25) {
                return 3;
            } else {
                return 4;
            }
        }
        else {
        return 0;
        }
    }
    public double duty(){
        double duty=0.0;
        switch (insuranceCategory()){
            case 0:  System.err.println("Incorrect data input. Age must be positive number.This car didn't exist already.");
            break;//как да го изкарам при самия модел?
            case 1: if (horsePower<=80) {
                	duty=150+(150*0.2);
    		    } else if (horsePower<=140){
                        duty=150;
		    } else {
                	duty = 150+(150*0.45);
            	    }
		    break;
            case 2:  if (horsePower<=80){
                duty=200+(200*0.2);
            }
            else if (horsePower<=140){
                duty=200;
            }
            else{
                duty = 200+(200*0.45);
            }
            break;
            case 3:  if (horsePower<=80){
                duty=300+(300*0.2);
            }
            else if (horsePower<=140){
                duty=300;
            }
            else{
                duty = 300+(300*0.45);
            }
            break;
            case 4:  if (horsePower<=80){
                duty=500+(500*0.2);
            }
            else if (horsePower<=140){
                duty=500;
            }
            else{
                duty = 500+(500*0.45);
            }
            break;

        }
	
	// Милен: Не е нужн да правиш цялата сметка в switch-a.
	// Ето един пример:
        int category = insuranceCategory();
        double tax = 0.0;
        switch (category) {
            case 1:
                tax = 150;
                break;
            case 2:
                tax = 200;
                break;
            case 3:
                tax = 300;
                break;
            case 4:
                tax = 500;
                break;
        }
        if (power < 80) {
            tax += + 0.2 * tax;
        }
        else if (power > 140) {
            tax += 0.45 * tax;
        }
        return tax;
	
        // -----------------------------

        return  duty;
    }
    public void print(){
        System.out.println(brand+" "+model+" "+horsePower+" "+year);
    }
    public void setYear(int yearValue) {
        this.year = yearValue;
    }

    public void setModel(String modelValue) {
        this.model = modelValue;
    }

    public void setBrand(String brandValue) {
        this.brand = brandValue;
    }

    public void setHorsePower(int horseP	ower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    public int getHorsePower() {
        return this.horsePower;
    }
}
