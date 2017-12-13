package Homework.Task0_Classes;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Pesho", 25);

        person1.sentence();

        Person person2 = new Person("Gosho");

        person2.sentence();

        Person person3 = new Person();

        person3.sentence();

        //Милен: Имената на променливите са camelCase
        Car Bugatti = new Car("Bugatti", "Veyron", 612, 2015);

        Bugatti.extraTaxation();

    }
}
