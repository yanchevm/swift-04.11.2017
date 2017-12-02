package Task3_BankManagement;

import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        System.out.println("Please choose an operation: ");
        String operation = sc.nextLine();

        while (true) {
            if (operation.equals("END")) {
                break;
            }
            String[] parts = operation.split("");


            switch (parts[0]) {
                case "OPEN":
                    System.out.println("Open: ");
                    bank.openAccount(parts[1], parts[2], parts[3], parts[4]);
                    break;
                case "CLOSE":
                    System.out.println("Close: ");
                    bank.closeAccount(parts[1], parts[2]);
                    break;
                case "DEPOSIT":
                    System.out.println("Deposit: ");
                    bank.deposit(parts[1], Double.parseDouble(parts[2]));
                    break;
                case "WITHDRAW":
                    System.out.println("Withdraw: ");
                    bank.withdraw(parts[1], parts[2], Double.parseDouble(parts[3]));
                    break;
                case "TRANSFER":
                    System.out.println("Transfer: ");
                    bank.transfer(parts[1], parts[2], Double.parseDouble(parts[3]), parts[4]);
                    break;
            }

            System.out.println("Please choose an operation: ");
            operation = sc.nextLine();
        }
        System.out.println(bank.getAssets());
    }
}
