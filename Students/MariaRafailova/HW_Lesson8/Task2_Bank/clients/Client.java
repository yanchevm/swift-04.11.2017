package Task2_Bank.clients;

public abstract class Client {
    protected String name;
    protected String type;// 1- fizichesko, 2- ligal

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    //public abstract String type(); - по-добре вместо това с type - 1, 2...
}
