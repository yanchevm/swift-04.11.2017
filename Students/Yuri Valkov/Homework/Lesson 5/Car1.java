package Task0_Classes.Car;

public class Car1 {
    public static void main(String[] args) {
        Car auto1 = new Car("Mercedes", "S220", 2009, 160
        );
        System.out.println(auto1.tax());

        Car auto2 = new Car("Opel", "Astra", 1996, 85 );
        System.out.println(auto2.tax());

        Car auto3 = new Car("Bugatti", "Veyron", 2015, 612);
        System.out.println(auto3.tax());

        Car auto4 = new Car("Lada", "5", 1989, 75);
        System.out.println(auto4.tax());


    }
}
