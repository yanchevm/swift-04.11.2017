package Task2_Bank.accounts;

import Task2_Bank.clients.Client;

public class LoanAccount extends Account{
    public LoanAccount(Client owner, double balance, double montlyInterestRate) {
        super(owner, balance, montlyInterestRate);
        this.type = "2";
    }

    @Override
    public void info(int months) {
        if (this.owner.equals("1")){
            System.out.println(months<=3 ? 0 : this.balance*this.montlyInterestRate*(months-3));
        }else {
            System.out.println(months<=2 ? 0 : this.balance*this.montlyInterestRate*(months-2));
        }
    }


}
