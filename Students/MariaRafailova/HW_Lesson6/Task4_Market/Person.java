package Task4_Market;

public class Person {
    private String name;
    private double balance;
    private Product[] products = new Product[100];

    public Person(String name, double balance) {
        if(!name.equals("")){
            this.name = name;
        }else {
            System.err.println("Name can’t be empty.");
            return;
        }
        if(balance>0){
            this.balance = balance;
        }else {
            System.err.println("Balance can’t be negative.");
            return;
        }
    }

    public void addProduct(Product p){
        for (int i = 0; i < this.products.length; i++) {
            if (products[i] == null){
                products[i] = p;
                this.balance -= p.getPrice();
                break;
            }
        }
    }

    public boolean isEmpty(){
            if (products[0] != null){
                return false;
            }
        return true;
    }

    public void printInfo(){
        System.out.print(this.name + " - ");
        if (this.isEmpty()){
            System.out.println("Nothing bought");
        } else {
            for (int i = 0; i < products.length ; i++) {
                if (products[i] != null){
                    if (products[i+1] == null){
                        System.out.print(products[i].getName());
                    }else{
                        System.out.print(products[i].getName() + ", ");
                    }
                }
            }
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
