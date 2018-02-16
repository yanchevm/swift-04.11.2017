package Task2_Bank;

public class MortgageAccount extends Account {

    public MortgageAccount(String owner, double balance, double monthlyInterestRate) {
        super(owner, balance, monthlyInterestRate);
        this.type = "3";
    }

    @Override

    public void info(int months) {
        if (this.owner.equals("1")) {
            if (months <= 6) {
                System.out.println(balance);
            } else {
                System.out.println((balance * monthlyInterestRate * months) - (balance * monthlyInterestRate * 6));
            }
        } else {
            if (months <= 12) {
                System.out.println(balance * (monthlyInterestRate / 2) * months);
            } else {
                System.out.println((balance * monthlyInterestRate * months) - (balance * (monthlyInterestRate / 2) * 12));
            }
        }


    }
}
