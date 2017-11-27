package Task0_Classes.Person;

public class DemoPerson {
    public static void main(String[] args) {

        Person pesho = new Person();
        Person gosho = new Person("Gosho");
        Person misho = new Person("Misho",25);

        System.out.println(pesho.printGreeting(pesho.getName(),pesho.getAge()));
        System.out.println(gosho.printGreeting(gosho.getName(),gosho.getAge()));
        System.out.println(misho.printGreeting(misho.getName(),misho.getAge()));
    }
}
