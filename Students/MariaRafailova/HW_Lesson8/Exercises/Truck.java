package Exercises;

public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice, String colour, int weight) {
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    @Override
    public double getSalePrice(){
        if(weight>2000){
            return (this.getRegularPrice() - this.getRegularPrice()*0.1);
        }
        return (this.getRegularPrice() - this.getRegularPrice()*0.2);
    }
}
