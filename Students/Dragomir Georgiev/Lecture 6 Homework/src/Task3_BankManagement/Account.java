package Task3_BankManagement;

public class Account {

    private String name;
    private String govID;
    private double balance;

    private String password;
    private String username;

    public Account(String username, String password, String name, String govID) {

        this.username = username;
        this.password = password;
        this.name = name;
        this.govID = govID;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(balance);
    }

    public void withdraw(double amount) {
        balance += amount;
        System.out.println(balance);
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public boolean hasAccess(String password) {
        if (password.equals(this.password)) {
            System.out.println("Password correct");
            return true;
        } else {
            System.out.println("Password incorrect");
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getGovID() {
        return govID;
    }

    public String getName() {
        return name;
    }

    public String getPassword(){
        return password;
    }


}
