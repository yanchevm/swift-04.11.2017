package Task2_Bank.accounts;

import Task2_Bank.clients.Client;

public class DepositAccount extends Account{
    public DepositAccount(Client owner, double balance, double montlyInterestRate) {
        super(owner, balance, montlyInterestRate);
        this.type = "1";
    }

    public void outgo(double amount){
        this.balance -= amount;
    }

    @Override
    public void info(int months) {
        System.out.println(this.balance*this.montlyInterestRate*months);
    }


}
