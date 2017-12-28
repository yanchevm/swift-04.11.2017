    package java.homework.homework2.Task0a_ReadInt;
    import java.util.Scanner;


 public class Task0a_ReadInt {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: "); //Милен: Няма нужда всяко ново твърдение да е изместено.
                                                  // Това се прави когато имат различен обхват - пример:
                                                  // if (something...) {
                                                  //    somethinglse....
                                                  // }
                int number = sc.nextInt();
                    number = ++number;
                        System.out.println("Your new number is: " +number);



     }



}
