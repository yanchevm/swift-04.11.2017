package Exercises;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String colour, int length) {
        super(speed, regularPrice, colour);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if(length>4){
            return (this.getRegularPrice() - this.getRegularPrice()*0.05);

        }
        else{
            return (this.getRegularPrice() - this.getRegularPrice()*0.1);
        }

    }
}
