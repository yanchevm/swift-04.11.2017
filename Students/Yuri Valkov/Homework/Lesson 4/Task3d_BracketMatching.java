package Task3d_BracketMatching;
import java.util.Scanner;

public class Task3d_BracketMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter some brackets: ");
        String text = sc.nextLine();

        String text2 = reduceStr(text);

        System.out.println(text2.equals("")? true : false);

    }
    //Милен: Добро решение!
    public static String reduceStr (String str){
        String newStr = str.replace("()", "").replace("[]", "").
                replace("{}", "");
        if (!newStr.equals(str)){
            return reduceStr(newStr);
        }
        return newStr;
    }
}
