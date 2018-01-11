import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new LinkedHashSet();
//      Set<String> set = new LinkedHashSet<>(); Така трябва да го записваш. 
//      Тук ползваш какво ?               //Диамантените скобички също се слагат, но без тип.

        System.out.println("Please enter a number N: ");
        int num = sc.nextInt();

        System.out.println("Please enter "+num+" numbers, separated by space: ");
        String str = sc.nextLine();

        String[] nums = str.split(" ");

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println(set);
    }
}
