package Task1_School;

public class Student extends Class{

    private String name;
    private String idStudent;

    public Student(String name, String idStudent, String idClass) {
        super(idClass);
        this.name = name;
        this.idStudent = idStudent;

        System.out.printf("%s , with unique id: %s is part of %s class %n", name, idStudent, idClass);
    }
}
