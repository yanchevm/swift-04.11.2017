package Homework.HWLecture10;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Stack;

public class Task7_StackMax {
	//Милен: БРАВО!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> stack = new Stack<>();
        Stack <Integer> trackMaxElement = new Stack<>();
        System.out.print("Enter operations: ");
        String command = sc.nextLine();
        int number=0;
        while (!command.equals("END")){
            String [] arr = command.split(" ");
            switch (arr[0]){
                case "PUSH":
                    number = Integer.parseInt(arr[1]);
                    if (stack.empty()){
                        trackMaxElement.push(number);
                    }
                    else{
                        int max = trackMaxElement.peek();
                        trackMaxElement.push(Math.max(max,number));
                    }
                    stack.push(number);
                    break;

                case "POP":
                    System.out.println(stack.pop());
                    trackMaxElement.pop();
                    break;

                case "MAX":
                    if(stack.empty()){
                        System.out.println("Stack is empty.");
                    }
                    else  {
                    System.out.println(trackMaxElement.peek());
                } break;
                default:
                    System.err.print("Wrong command!");
                    break;
            }
            System.out.print("Enter operations: ");
            command = sc.nextLine();
        }
        System.out.print(stack);
    }
}
