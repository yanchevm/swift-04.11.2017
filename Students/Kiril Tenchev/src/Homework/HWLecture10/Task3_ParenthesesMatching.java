package Homework.HWLecture10;

import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some sentence to check brackets: ");
        String str= sc.nextLine();
        System.out.println(checkBrackets(str));

    }
	//Милен: БРАВО!
    public static boolean checkBrackets(String str) {
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
