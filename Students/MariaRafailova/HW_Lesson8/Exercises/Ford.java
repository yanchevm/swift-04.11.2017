package Exercises;

public class Ford extends  Car{
    private int year;
    private int manifacturerDiscount;

    public Ford(int speed, double regularPrice, String colour, int year, int manifacturerDiscount) {
        super(speed, regularPrice, colour);
        this.year = year;
        this.manifacturerDiscount = manifacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return ((int)this.getRegularPrice() - this.manifacturerDiscount);
    }


}
