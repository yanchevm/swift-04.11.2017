package Task3_BankManagement;

public class Account {
    private String name;
    private String govId;
    private double balance; //lv

    private String password;
    private String username;

    public Account(String name, String govId, String username, String password){
        this.name = name;
        this.govId = govId;
        this.username = username;
        this.password = password;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount>0){
            this.balance -= amount;
        }
    }

    public boolean hasAccess(String password){

        return this.password.equals(password)? true: false;
    }

    public void printInfo(){

        System.out.printf("%s, %s, %s%n", this.name, this.govId, this.balance);
    }

    public double getBalance(){
        return this.balance;
    }

    public String getName() {
        return name;
    }

    public String getGovId() {
        return govId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return  this.password;
    }

}
