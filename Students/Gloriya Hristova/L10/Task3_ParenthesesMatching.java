package data_structures;

import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack <Character> stack = new Stack<>();
        String brackets;
        boolean flag=true;
        brackets=input.nextLine();
        for(int i =0;i<brackets.length();i++){
	    // Милен: Ето един съвет, как да преизползваш код:
	    // char c = charAt(i);
	    // сега навсякъде използваш c вместо на толкова места да пишеше brackets.charAt(i) 
            if(brackets.charAt(i)=='{'||brackets.charAt(i)=='('||brackets.charAt(i)=='['){
                stack.push(brackets.charAt(i));
            }
            if(brackets.charAt(i)=='}'||brackets.charAt(i)==')'||brackets.charAt(i)==']'){
                if(brackets.charAt(i)=='}'){
                    if(stack.peek()=='{'){
                    stack.pop();
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                    }
                }
                if(brackets.charAt(i)==')'){
                    if(stack.peek()=='('){
                    stack.pop();
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                    }
                }
                if(brackets.charAt(i)==']'){
                    if(stack.peek()=='['){
                    stack.pop();
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                    }
                }
            }
        }
        if(!flag){ //Милен: Според мен нямаш нужда от такъв флаг. Можеш просто да провериш дали stack-a е празен :)
            System.out.println("False.");
        }
        else{
            System.out.println("True.");
        }
    }
}
