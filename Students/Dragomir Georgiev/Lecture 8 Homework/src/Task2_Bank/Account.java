package Task2_Bank;

import java.util.Random;

public abstract class Account {

    public String owner;
    public double balance;
    public double monthlyInterestRate;
    private String iban;
    public String type;


    public Account(String owner, double balance, double monthlyInterestRate) {
        this.owner = owner;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.iban = createIban(8);
    }

    public void cashDeposit(double deposit) {
        balance = +deposit;
    }

    String createIban(int length) {
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length - 1; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public double getMonthlyInterestRate(){
        return monthlyInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }

    public String toString(){
        return ("balance = " + balance);
    }

    public abstract void info (int months);
}


