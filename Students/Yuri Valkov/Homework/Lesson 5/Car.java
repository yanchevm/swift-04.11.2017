package Task0_Classes.Car;

import java.time.Year;

public class Car {
    private String model;
    private double horsepower;
    private String brand;
    private int year;

    public Car(String brand, String model,int year, double horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.year = year;
    }
    public String insurance(int year) {
        int caryears = Year.now().getValue() - year;
        if (caryears <= 8) {
            return "cat 1";
        } else if (caryears > 8 && caryears <= 15) {
            return "cat 2";
        } else if (caryears > 15 && caryears < 25) {
            return "cat 3";
        } else {
            return "cat 4";
        }
    }
            public double tax() {
                double hpindex;
                    if (this.horsepower > 140) {
                        hpindex = 1.45;
                    } else if (this.horsepower < 80) {
                        hpindex = 1.2;
                    } else {
                        hpindex = 1;
                    }

                        if (this.insurance(this.year).equals("cat 1")) {
                            return hpindex*150;
                        } else if (this.insurance(this.year).equals("cat 2")) {
                            return hpindex*200;
                        } else if (this.insurance(this.year).equals("cat 3")) {
                            return  hpindex*300;
                        } else {
                            return hpindex*500;
                        }
                    }
    }


