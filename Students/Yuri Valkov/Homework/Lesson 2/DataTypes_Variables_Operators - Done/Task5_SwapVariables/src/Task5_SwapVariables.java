public class Task5_SwapVariables {
    public static void main(String[] args) {
       int a=11;
       int b=7;
          //First method:
            /*   a = a - b;
              b = a + b;
               a = b - a; */
            //Second method:
           a = a ^ b;
          b = b ^ a;
         a = a ^ b;

          System.out.println("a: " + a);
            System.out.println("b: " + b);
    }
}