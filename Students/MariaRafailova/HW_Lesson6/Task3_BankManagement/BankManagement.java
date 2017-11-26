package Task3_BankManagement;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        System.out.println("Please enter operation: ");
        String input = sc.nextLine();

        while (true){
            if(input.equals("END")){
                break;
            }
            String[] parts = input.split(" ");

            switch (parts[0]){
                case "OPEN":
                    System.out.print("OPEN ");
                    bank.openAccount(parts[1], parts[2], parts[3], parts[4]);break;
                case "CLOSE":
                    System.out.print("CLOSE ");
                    bank.closeAccount(parts[1],parts[2]);break;
                case "DEPOSIT":
                    System.out.print("DEPOSIT ");
                    bank.deposit(parts[1],Double.parseDouble(parts[2]));break;
                case "WITHDRAW":
                    System.out.print("WITHDRAW ");
                    bank.withdraw(parts[1], parts[2],Double.parseDouble(parts[3]));break;
                case "TRANSFER":
                    System.out.print("TRANSFER ");
                    bank.transfer(parts[1], parts[2], Double.parseDouble(parts[3]), parts[4]);
            }

            System.out.println("Please enter operation: ");
            input = sc.nextLine();
        }

        System.out.println(bank.getAssets());

        bank.printBalances();


    }
}
