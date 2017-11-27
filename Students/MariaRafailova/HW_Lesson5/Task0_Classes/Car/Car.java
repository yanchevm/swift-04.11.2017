package Task0_Classes.Car;

import java.time.Year;

public class Car {
    private String brand;
    private String model;
    private double enginePower;
    private int yearManufacture;

    public Car(String brand, String model, double enginePower, int yearManufacture) {
        this.brand = brand;
        this.model = model;
        this.enginePower = enginePower;
        this.yearManufacture = yearManufacture;
    }

    public String insuranceCategory(int yearManufact) {
        int years = Year.now().getValue()- yearManufact;
        if (years <=8){
            return "category 1";
        } else if (years>8 && years<=15){
            return "category 2";
        }else  if (years>15 && years<25){
            return "category 3";
        } else {
            return "category 4";
        }
    }

    public double taxBGN(){
        double kWDependency;
        if(this.enginePower <80){
            kWDependency = 1.2;
        }
        else if (this.enginePower>140){
            kWDependency = 1.45;
        }else {
            kWDependency = 1;
        }

            if (this.insuranceCategory(this.yearManufacture).equals("category 1")){
                return 150*kWDependency;
            } else if (this.insuranceCategory(this.yearManufacture).equals("category 2")){
                return 200*kWDependency;
            }else  if (this.insuranceCategory(this.yearManufacture).equals("category 3")){
                return 300*kWDependency;
            } else {
                return 500*kWDependency;
            }
    }

}

