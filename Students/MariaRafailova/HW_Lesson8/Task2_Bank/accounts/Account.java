package Task2_Bank.accounts;

import Task2_Bank.clients.Client;

import java.util.Arrays;

public abstract class Account {
    public  static String iban = "";
    protected  static int[] ibanArr = new int[8];
    protected static int countIBAN = 0;
    protected Client owner;// 1- fizichesko, 2- ligal
    protected double balance;
    protected double montlyInterestRate;
    protected String type;

    public Account(Client owner, double balance, double montlyInterestRate) {
        this.owner = owner;
        this.balance = balance;
        this.montlyInterestRate = montlyInterestRate;
        this.iban = createIBAN();
    }

    public static String createIBAN(){
        iban = "";
        for (int i = ibanArr.length-1; i>= 0; i--) {
            if(ibanArr[i]<9){
                countIBAN +=1;
                ibanArr[i] = countIBAN;
                if(countIBAN == 9) {
                    countIBAN = 0;
                }
                break;
            }
        }

        for (int j = 0; j < ibanArr.length; j++) {
            iban += ibanArr[j];
        }
        return iban;
    }

    public void printIban(){
        System.out.println(this.iban);
    }

    public void put(double amount){
        this.balance += amount;
    }

    public void get(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }
    }

    public abstract void info(int months);

    @Override
    public String toString() {
        return ("balance=" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getIban(){
        return this.iban;
    }

}
