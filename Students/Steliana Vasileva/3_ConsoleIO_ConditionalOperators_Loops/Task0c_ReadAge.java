import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Age = Integer.parseInt(sc.nextLine());

        if (Age>=18){
            System.out.println("Adult");
        } else {
            System.out.println("Underage");
        }
    }
}
