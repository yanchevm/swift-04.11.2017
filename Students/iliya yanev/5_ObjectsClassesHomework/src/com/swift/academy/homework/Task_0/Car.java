package com.swift.academy.homework.Task_0;

import java.time.Year;

public class Car {

    private String brandName;
    private String model;
    private int power;
    private int yearOfManufacture;

    public Car(String brandName, String model, int power, int yearOfManufacture) {
        this.brandName = brandName;
        this.model = model;
        this.power = power;
        this.yearOfManufacture = yearOfManufacture;
    }

    public int insuranceCategory() {
        int age = Year.now().getValue() - yearOfManufacture; //Милен: БРАВО!
        if (age < 8) {
            return 1;
        }
        else if (age >= 8 && age < 15) { //Милен: Има ли нужда да проверяваш, че age > 8 ? Ако е по-малко нямаше да стигнеш тук.
            return 2;
        }
        else if (age >= 15 && age < 25) {
            return 3;
        }
        else {
            return 4;
        }
    }

    //Милен: БРАВО!
    public double tax() {
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
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
