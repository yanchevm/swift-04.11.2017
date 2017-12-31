package data_structures;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class NStack{
    Scanner input = new Scanner(System.in);
    Stack <Integer> stack = new Stack <>();
    TreeSet <Integer> m = new TreeSet <>();
    String text, command;
    String []push;
    int p,counter=0,max;
    int [] last = new int[15];
    
    void setCommand(){
        do{
            text=input.nextLine();
            push=text.trim().split(" ");
            command=push[0];
            switch(command){
                case "PUSH":
                    p=Integer.parseInt(push[1]);
                    if(counter>=0){
                        counter++;
                    }
                    last[counter]=p;
                    stack.push(p);
                    m.add(p);
                    break;
                case "POP":
                    if(!stack.isEmpty()){
                        System.out.println(stack.pop());
                        m.remove(last[counter]);
                        counter--;
                    }
                    else{
                        System.out.println("Stack empty.");
                    }
                    break;
                case "MAX":
                    max=m.last();
                    System.out.println(max);
                    break;
                case "END":
                    while(!stack.isEmpty()){
                        System.out.print(stack.pop()+" ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid input.");
            }   
        }while(!command.equals("END"));
    }
}


public class Task7_StackMax{
   
    public static void main(String[] args){
        NStack n = new NStack();
        n.setCommand();
    }
}