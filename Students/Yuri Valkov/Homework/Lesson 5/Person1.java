package Task0_Classes;

public class Person1 {
    public static void main(String[] args) {

        Person Kiril = new Person();
        Person Vasea = new Person("Vasea");
        Person Oleg = new Person("Oleg",11);


        System.out.println(Vasea.print(Vasea.getName(),Vasea.getAge()));
        System.out.println(Oleg.print(Oleg.getName(),Oleg.getAge()));
        System.out.println(Kiril.print(Kiril.getName(),Kiril.getAge()));
    }
}
