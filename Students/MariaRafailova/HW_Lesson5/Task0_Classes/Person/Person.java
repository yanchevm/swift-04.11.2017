package Task0_Classes.Person;

public class Person {
    private String name;
    private int age;

    Person(){
        this.name = "No name";
        this.age = -1;
    }

    Person(String name){
        this.name = name;
        this.age = -1;
    }

    Person(String name, int age){
        if(!name.equals("") && (age>0 && age<120)){
            this.name = name;
            this.age = age;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(!name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Please enter again.");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        if(age <0 || age>120){
            System.out.println("Please enter again.");
        }else{
            this.age = age;
        }
    }

    public String printGreeting(String name, int age){
         if(age < 0 && name.equals("No name")){
            return "I am John Doe";
        }else if(age < 0){
             return "Hello, I am " + name;
         } else{
             return "Hello, I am "+name+". I am "+age+" years old";
         }
    }
}
