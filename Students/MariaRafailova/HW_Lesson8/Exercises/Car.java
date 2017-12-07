package Exercises;

public abstract class Car {
    private int speed;
    private double regularPrice;
    private String colour;
    private double salePrice;


    public Car(int speed, double regularPrice, String colour){
        this.colour = colour;
        this.regularPrice = regularPrice;
        this.speed = speed;
    }

    public abstract double getSalePrice();

    public double getRegularPrice() {
        return regularPrice;
    }
}
