package Task2_Bank;

public class DepositAccount extends Account {

    public DepositAccount(String owner, double balance, double monthlyInterestRate) {
        super(owner, balance, monthlyInterestRate);
        this.type = "1";
    }

    public void cashWithdraw (double withdraw){
        balance -= withdraw;
    }

    @Override
    public void info(int months) {
        System.out.println(this.balance*this.monthlyInterestRate*months);
    }
}
