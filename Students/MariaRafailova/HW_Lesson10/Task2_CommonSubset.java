import java.util.HashSet;
import java.util.Scanner;

public class Task2_CommonSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers, separated by space:");
        String mn = sc.nextLine();

        String[] arr = mn.split(" ");

        System.out.println("please enter "+ arr[0]+" numbers, separated by space:");
        String m = sc.nextLine();

        String[] arrM = m.split(" ");
        HashSet<String> hsM = new HashSet<>();
        for (int i = 0; i < arrM.length ; i++) {
            hsM.add(arrM[i]);
        }

        System.out.println("please enter "+ arr[1]+" numbers, separated by space:");
        String n = sc.nextLine();

        String[] arrN = n.split(" ");
        HashSet<String> hsN = new HashSet<>();
        for (int i = 0; i < arrN.length ; i++) {
            if (hsM.contains(arrN[i])){
                hsN.add(arrN[i]);
            }
        }

        if (hsN.isEmpty()){
            System.out.println("NO");
        }
        else{
            System.out.println(hsN);
        }


    }
}
