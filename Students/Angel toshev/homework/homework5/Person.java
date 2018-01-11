package homework.homework5;

/**
 * Created by Admin on 1.12.2017 г..
 */
public class Person {
      String name;
     int age;
   public Person(){
        name="No name";
        age=-1;
    }
    public Person(String name){
       this.name=name; //Милен: Тук не си изпълнил условието от задачата. При това положение, age олко ще бъде? По условие, трябва да бъде -1
    }
   public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void print(){
       if (age>0)
           System.out.printf("I am %s and I am %d years old\n",name,age);
       else
       if (age == -1)
           System.out.printf("I am Jon doe\n");
       else
           System.out.printf("I am %s\n",name);

    }
}
