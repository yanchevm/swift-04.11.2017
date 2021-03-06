

import java.util.Arrays;

public abstract class Account {
    public  static String iban = "";
    protected  static int[] ibanArr = new int[8];
    protected static int countIBAN = 0;
    protected Client owner;
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
        //Милен: Защо не използваш Randоm класа ? Ще стане доста по-лесно. Освен това, избягвай да записваш такава специфична информация за обекта като статична!
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