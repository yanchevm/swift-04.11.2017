package Task2_Bank.clients;

import Task2_Bank.clients.Client;

public class IndividualCustomer extends Client {

    public IndividualCustomer(String name) {
        super(name);
        this.type = "1";
    }
}
