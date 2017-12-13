package Homework.HWLecture4.Task3;
import java.util.Scanner;
import java.util.Stack;
public class Task3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some combination of brackets to check: ");
        String str= sc.nextLine();
        System.out.println(CheckParentesis(str));

    }
    public static boolean CheckParentesis(String str) //Милен: Методите започват с малка буква и отварящата скоба е на същия ред!
    {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }


            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }
}
