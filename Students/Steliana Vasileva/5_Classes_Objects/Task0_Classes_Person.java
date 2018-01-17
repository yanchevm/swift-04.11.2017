public class Task0_Classes_Person {
    String name;
    int age;

    void Task0_Classes_Person() {
// Милен: Тук не изпълняваш условието на задачата!
    }

    void Task0_Classes_Person(String name) {
	// Милен: Също тук!
        this.name = name;
    }

    public void Task0_Classes_Person(String name, int age) {
	// Милен: Имаш написани много хубави set методи! Защо не ги използваш тук за да провериш дали стойностите са валидни ?        
	this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age != 0 && age > 0) {
            this.age = age;
        }
    }

    public void printGreeting(String greeting) {

        if (getAge() != 0 && getName() != null) {
            System.out.printf("Hello, I am %s. I am %d years old./n", getName(), getAge());
        } else if (getAge() == 0) {
            System.out.printf("Hello, I am %s./n", getName());
        } else if ( getName().equals(null)){
            System.out.println("I am John Doe.");
        }

    }


    }
