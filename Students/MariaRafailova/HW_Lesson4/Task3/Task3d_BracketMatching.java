package Task3;

import java.util.Scanner;

public class Task3d_BracketMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a combination of brackets: ");
        String str = sc.nextLine();

        String str2 = reduceStr(str);

        System.out.println(str2.equals("")? true : false);

    }

    public static String reduceStr (String str){
        String newStr = str.replace("()", "").replace("[]", "").
                replace("{}", "");
        if (!newStr.equals(str)){
            return reduceStr(newStr);
        }
        return newStr;
    }
}
