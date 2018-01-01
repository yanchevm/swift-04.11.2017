package Homework.HWLecture5.Task0a;

public class Person {
    private String name;
    private int years;

    public Person() {
        name = "No name";
        years = -1;
    }

    public Person(String nameValue) {
        name = nameValue; // Милен: Направил си такива хубави сет методи! Защо не ги използваш и тук ? Какво ще стане ако клиента на кода ти, въведе невалидно име или невалидни години ?
        years = -1;
    }

    public Person(String nameValue, int yearsValue) {
        name=nameValue;
        years=yearsValue;
    }

    public void print() {
        if((!name.equals("No name")&&!name.equals(""))&&years<0) {
            System.out.println("Hello, I'm " + name + ".");
        }
        else if ((name.equals("No name")||name.equals(""))&&years<0) {
            System.out.println("I'm John Doe.");
        }
         else if ((!name.equals("No name")&&!name.isEmpty())&&years>=0) {
            System.out.println("Hello, I'm " + name + ". I'm " + years + " years old.");
        }
    }



    public void setName(String nameValue) {
        if (!name.matches("[A-Za-z]")&&!name.equals("No name")){
            System.err.println("Incorrect data.");
        }
        else
           this.name = nameValue;
    }



    public void setYears(int yearsValue) {
       if(years>=0||years==-1){
           this.years = yearsValue;
       }
       else{
           System.out.println("Illegal data.");
       }

    }

    public String getName() {
        return this.name;
    }

    public int getYears() {
        return this.years;
    }
}
