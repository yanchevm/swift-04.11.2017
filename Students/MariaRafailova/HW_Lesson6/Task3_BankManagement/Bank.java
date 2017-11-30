package Task3_BankManagement;

public class Bank {
    private Account[] accounts = new Account[5];
    int index = 0;
    private double assets;

    public void openAccount(String username, String password, String name, String govId){
        if(index < 5){
            accounts[index]= new Account(name,govId,username, password);
            index++;
            System.out.println("success");
        }
        else {
            System.out.println("fail");
        }
    }

    public void closeAccount(String username, String password){
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].getUsername().equals(username) &&
                    accounts[i].getPassword().equals(password)){
                accounts[i] = null;
                System.out.println("success");
                index--;
                return;
            }
        }
        System.out.println("fail");
    }

    public void deposit(String username, double amount){
        if (amount > 0){
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i].getUsername().equals(username)){
                    accounts[i].deposit(amount);
                    System.out.println("success");
                    return;
                }
            }
        }
        System.out.println("fail");
    }

    public void withdraw(String username, String password, double amount){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getUsername().equals(username) && accounts[i].getPassword().equals(password)
                    && amount < accounts[i].getBalance()){
                    accounts[i].withdraw(amount);
                    System.out.println("success");
                    return;
            }
        }
        System.out.println("fail");
    }

    public void transfer(String username, String password, double amount, String recipient){
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts.length; j++) {
                if(accounts[i].getUsername().equals(username)&&accounts[i].getPassword().equals(password)
                        && accounts[j].getUsername().equals(recipient)
                        && amount < accounts[i].getBalance()){
                    accounts[i].withdraw(amount);
                    accounts[j].deposit(amount);
                    System.out.println("success");
                    return;
                }
            }
        }
        System.out.println("fail");
    }

    public double getAssets(){
        double sum = 0;
        for (int i = 0; i < this.accounts.length; i++) {
            sum += accounts[i].getBalance();
        }
        return sum;
    }

    public Account[] getAccounts(){
        return this.accounts;
    }

    public void printBalances(){
        for (int i = 0; i <accounts.length ; i++) {
            accounts[i].printInfo();
        }
    }
}
