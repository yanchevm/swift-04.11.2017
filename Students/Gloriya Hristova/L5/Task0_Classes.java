package task0_classes;

import java.util.Scanner;

class Person{
    String name;
        int age;
        public Person(){// constructor
        this.name ="No name";
        this.age=-1;
        }
        public Person(String name){// constructor
        this.name =name;
        this.age=-1;
        }
        public Person(String name, int age){// constructor
        this.name =name;
        this.age=age;
        }
        public void setPersonalCh(String name,int age){
            this.name =name;
            this.age=age;
        }
        int getAge(){
            return age;
        }
        String getName(){
            return name;
        }
        static void printPersonalCh(String name,int age){
            if(name==null){
             System.out.println("I am John Doe.");   
            }else{
            System.out.println("Hello I'm "+name+". ");}
            if(age >0){
            System.out.println("I am "+age+" years old.");}
        }
    
}

public class Task0_Classes {

   
    public static void main(String[] args) {
        String x="John";
        int y = 25;
        Scanner input = new Scanner(System.in);
        Person john = new Person(x,y);
        System.out.println("Name: ");
        x = input.nextLine();
        System.out.println("Age: ");
        y = input.nextInt();
        john.setPersonalCh(x,y);
        john.printPersonalCh(x,y);
    }
    
}
