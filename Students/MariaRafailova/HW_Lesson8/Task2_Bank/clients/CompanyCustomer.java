package Task2_Bank.clients;

import Task2_Bank.clients.Client;

public class CompanyCustomer extends Client {
    public CompanyCustomer(String name) {
        super(name);
        this.type = "2";
    }
}
