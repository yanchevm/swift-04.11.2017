package Task2_Bank;

import java.lang.reflect.Array;
import java.util.Arrays;

public class proba {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[2] = 9;
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
