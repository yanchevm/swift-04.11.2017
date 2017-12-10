package Task2_Bank.accounts;

import Task2_Bank.clients.Client;

public class MortgageAccount extends Account {
    public MortgageAccount(Client owner, double balance, double montlyInterestRate) {
        super(owner, balance, montlyInterestRate);
        this.type = "3";
    }

    @Override
    public void info(int months) {
        if (this.owner.equals("1")){
            System.out.println(months<=6 ? 0 : this.balance*this.montlyInterestRate*(months-6));
        }else {
            System.out.println(months<=12 ? (this.balance*this.montlyInterestRate*months)/2 :
                                                    ((this.balance*this.montlyInterestRate*12)/2 +
                                                    this.balance*this.montlyInterestRate*(months-12))); ;
        }
    }
}
