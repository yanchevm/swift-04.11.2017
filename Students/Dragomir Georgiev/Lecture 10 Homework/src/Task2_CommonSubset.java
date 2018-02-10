import java.util.*;

public class Task2_CommonSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers for the count of the two rows: ");
        String mn = sc.nextLine();
        String[] array = mn.split(" ");

        String m = sc.nextLine();
        String[] array2 = m.split(" ");

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < array2.length; i++) {
            hashSet.add(array2[i]);
        }

        String n = sc.nextLine();
        String[] array3 = n.split(" ");

        HashSet<String> hashSet2 = new HashSet<>();

        for (int i = 0; i < array3.length; i++) {
            hashSet2.add(array3[i]);
        }


        if (hashSet.contains(hashSet2) && hashSet2.contains(hashSet)) {
            System.out.println(hashSet);
            System.out.println(hashSet2);
        } else {
            System.out.println("NO");
        }
    }
}

