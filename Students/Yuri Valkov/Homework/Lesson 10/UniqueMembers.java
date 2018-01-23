import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueMembers {
    //Милен: БРАВО! Правилната структира си избрал!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new LinkedHashSet(); //Милен: Полиморфизъм! Set<String> set = new LinkedHashSet(); 

        System.out.println("Please enter a number X: ");
        int num = sc.nextInt();

        System.out.println("Please enter "+num+" separated numbers: ");
        String str = sc.nextLine();

        String [] nums = str.split(" ");

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println(set);
    }
}