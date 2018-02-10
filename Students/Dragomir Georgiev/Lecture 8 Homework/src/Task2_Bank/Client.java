package Task2_Bank;

public abstract class Client {

    private String name;
    public short type;

    public Client (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
