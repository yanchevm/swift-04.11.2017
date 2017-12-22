package Credentials;
import java.util.Scanner;

public class Task2_CredentialsManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Credentials[] cr = new Credentials[200];
        int index = 0;

        System.out.println("Please, enter command, username, pass and new pass if you want to change it: ");
        String input = sc.nextLine();

        while(!input.equals("END")){
            String[] parts = input.split(" ");

            // Милен: Защо не пробваш с switch вмето толкова иф-ове ?
            // Може също да си направиш отделни методи за всяка операция.
            if(parts[0].equals("ENROLL")){
                cr[index] = new Credentials(parts[1],parts[2]);
                index++;
                System.out.println("ENROLL success");
            }
            if(parts[0].equals("CHPASS")){
                for (int i = 0; i < cr.length; i++) {
                    if(parts[1].equals(cr[i].getUsername())){
                        cr[i].setPassword(parts[2],parts[3]);
                        if (!cr[i].getWrongPass2()){
                            System.out.println("CHPASS success");
                        }
                        else {
                            System.out.println("CHPASS fail");
                        }
                        break;
                    }
                }
            }
            if(parts[0].equals("AUTH")){
                for (int i = 0; i < cr.length; i++) {
                    if(parts[1].equals(cr[i].getUsername())){
                        if (cr[i].checkPassword(parts[2])){
                            System.out.println("AUTH success");
                        }
                        else {
                            System.out.println("AUTH fail");
                        }
                        break;
                    }
                }
            }

            System.out.println("Please, enter command, username, pass and new pass if you want to change it:");
            input = sc.nextLine();
        }

    }
}
