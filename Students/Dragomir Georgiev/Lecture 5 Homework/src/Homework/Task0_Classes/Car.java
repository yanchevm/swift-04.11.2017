package Homework.Task0_Classes;

import java.util.Calendar;
import java.util.Date;

public class Car {

    private String brand;
    private String model;
    private int horsePower;
    private int manufacturingYear;


    public Car(String brand, String model, int horsePower, int manufacturingYear) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.manufacturingYear = manufacturingYear;
    }

//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getHorsePower() {
//        return horsePower;
//    }
//
//    public int getManufacturingYear() {
//        return manufacturingYear;
//    }

    private int insuranceCategory() {
        Date now = new Date(); //Милен: Това защо ти е ?
        int currentYear = Calendar.YEAR; //Милен: Можеш ли да използваш тук Year ?
        int ageCar = currentYear - manufacturingYear;
        int category;
        //Милен: БРАВО, много добре си наредил switch конструкцията
        if (ageCar <= 8) {
            category = 1;
        } else if (ageCar <= 15) {
            category = 2;
        } else if (ageCar <= 25) {
            category = 3;
        } else {
            category = 4;
        }
            return category;
    }

    public int taxation(){
        int tax = 0;
        switch (insuranceCategory()){
            case 1: tax = 150;
            break;
            case 2: tax = 200;
            break;
            case 3: tax = 300;
            break;
            case 4: tax = 500;
            break;

        }
            return tax;
    }

    //Милен: БРАВО!
    public void extraTaxation(){
        double fullTaxation;
        if (horsePower < 80){
            fullTaxation = taxation() + (0.2 * taxation());
            System.out.println("The full taxation is: " + fullTaxation);
        } else if (horsePower > 140){
            fullTaxation = taxation() + (0.45 * taxation());
            System.out.println("The full taxation is: " + fullTaxation);
        } else {
            System.out.println("The full taxation is: " + taxation());
        }
    }
}
