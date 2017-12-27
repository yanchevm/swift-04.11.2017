import java.util.*;

public class Task7_StackMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.println("Please enter operations:");
        String input = sc.nextLine();
        do{
            String[] parts = input.split(" ");

            if(parts[0].equals("PUSH")){
                int number = Integer.parseInt(parts[1]);
                stack.push(number);
            } else if(parts[0].equals("POP")){
                System.out.println(stack.peek());
                stack.pop();
            }else {
                int max = Collections.max(stack);
                System.out.println(max);
            }

            input = sc.nextLine();

        }while (!input.equals("END"));
        System.out.println();

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.peek()+" ");
            stack.pop();
        }

//        for(Integer i : stack){
//            System.out.print(i + " ");
//        }

        //System.out.println(Arrays.toString(stack.toArray()));

    }
}
