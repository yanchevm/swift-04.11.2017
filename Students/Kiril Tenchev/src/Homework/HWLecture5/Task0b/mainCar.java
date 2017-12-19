package Homework.HWLecture5.Task0b;

public class mainCar {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes-Benz","S220",160,2009 );
        c1.print();
        System.out.println(c1.duty());
        System.out.println(".......................................");
        Car c2 = new Car("Opel","Astra",85,1996);
        c2.print();
        System.out.println(c2.duty());
        System.out.println(".......................................");
        Car c3 = new Car("Bugatti", "Veyron",612,2015);
        c3.print();
        System.out.println(c3.duty());
        System.out.println(".......................................");
        Car c4=new Car("Lada","5",75,1989);
        c4.print();
        System.out.println(c4.duty());
        System.out.println(".......................................");
        Car c5=new Car("Tesle","Roadster",800,2020);
        c5.print();
        System.out.println(c5.duty());
        System.out.println(".......................................");
    }

}
