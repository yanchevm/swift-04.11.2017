package Task3_BankManagement;

public class Bank {

    private Account[] accounts = new Account[5];
    int index = 0;
    private double assets;

    public void openAccount(String name, String govId, String username, String password) {
        if (index < 5) {
            accounts[index] = new Account(username, password, name, govId);
            index++;
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public void closeAccount(String username, String password) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getUsername().equals(username) && accounts[i].getPassword().equals(password)) {
                accounts[i] = null;
                System.out.println("Success");
                index--;
                return;
            }
        }
        System.out.println("Fail");
    }

    public void deposit(String username, double amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getUsername().equals(username)) {
                accounts[i].deposit(amount);
                System.out.println("Success");
                return;
            }
            System.out.println("Fail");
        }
    }

    public void withdraw(String username, String password, double amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getUsername().equals(username) && accounts[i].getPassword().equals(password) &&
                    amount < accounts[i].getBalance()) {
                accounts[i].withdraw(amount);
                System.out.println("Success");
            }
            System.out.println("Fail");
        }
    }

    public void transfer(String username, String password, double amount, String recipient) {
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts.length; j++) {
                if (accounts[i].getUsername().equals(username) && accounts[i].getPassword().equals(password) &&
                        accounts[j].getUsername().equals(recipient) && amount < accounts[i].getBalance()) {
                    accounts[i].withdraw(amount);
                    accounts[j].deposit(amount);
                    System.out.println("Success");
                    return;
                }
            }
        }
        System.out.println("Fail");
    }

    public double getAssets() {
        double sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum += accounts[i].getBalance();

        }
        return sum;
    }

    public Account[] getAccounts() {
        return this.accounts;
    }


}
