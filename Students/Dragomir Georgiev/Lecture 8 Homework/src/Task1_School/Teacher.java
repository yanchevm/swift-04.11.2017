package Task1_School;

public class Teacher extends Discipline{

    private String name;

    public Teacher(String name, String discipline, double lectures) {
        super(discipline, lectures);
        this.name = name;

        System.out.printf("%s teaches %s %.1f hours a week %n", name, discipline, lectures);
    }
}
