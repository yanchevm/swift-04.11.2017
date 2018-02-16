package Task2_Bank;

public class LoanAccount extends Account {

    public LoanAccount(String owner, double balance, double monthlyInterestRate) {
        super(owner, balance, monthlyInterestRate);
        this.type = "2";
    }

    @Override

    public void info(int months) {
        if (this.owner.equals("1")) {
            if (months <= 3) {
                System.out.println(balance);
            } else {
                System.out.println(balance * monthlyInterestRate * months - balance * monthlyInterestRate * 3);
            }
        } else {
            if (months <= 2) {
                System.out.println(balance);
            } else {
                System.out.println(balance * monthlyInterestRate * months - balance * monthlyInterestRate * 2);
            }
        }
    }


}
