package Exercises;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(100, 50_000, "red", 3);
        System.out.println(sedan.getSalePrice());

        Ford ford1 = new Ford(120, 30_000, "blue", 2010, 10);
        System.out.println(ford1.getSalePrice());
        Ford ford2 = new Ford(130, 45_000, "black", 2012, 5);
        System.out.println(ford2.getSalePrice());

        Car truck = new Truck(40,80_000,"white", 1000);
        System.out.println(truck.getSalePrice());

    }

}
