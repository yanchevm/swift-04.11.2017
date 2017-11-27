package Task0_Classes.Car;

public class DemoCar {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes-Benz", "S220",160, 2009);
        System.out.println(car1.taxBGN());

        Car car2 = new Car("Opel", "Astra", 85,1996);
        System.out.println(car2.taxBGN());

        Car car3 = new Car("Bugatti","Veyron",612,2015);
        System.out.println(car3.taxBGN());

        Car car4 = new Car("Lada","5",75,1989);
        System.out.println(car4.taxBGN());
    }
}
