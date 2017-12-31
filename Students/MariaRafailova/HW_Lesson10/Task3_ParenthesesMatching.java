import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a math expression:");
        String str = sc.nextLine();

        Stack<String> stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== '(' || str.charAt(i)== '[' || str.charAt(i)== '{') {
                stack.push((String.valueOf(str.charAt(i))));
            }

            if (str.charAt(i)== ')' || str.charAt(i)== ']' || str.charAt(i)== '}') {
                if (stack.isEmpty()) {
                    System.out.println("False");
                    return;
                }

                if (str.charAt(i)== ')'){
                    if (stack.peek().equals(String.valueOf('('))){
                        stack.pop();
                    }else{
                        System.out.println("False");
                        return;
                    }
                }

                if (str.charAt(i)== ']'){
                    if (stack.peek().equals(String.valueOf('['))){
                        stack.pop();
                    }else{
                        System.out.println("False");
                        return;
                    }
                }

                if (str.charAt(i)== '}'){
                    if (stack.peek().equals(String.valueOf('{'))){
                        stack.pop();
                    }else{
                        System.out.println("False");
                        return;
                    }
                }

            }
        }

        if (stack.isEmpty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
