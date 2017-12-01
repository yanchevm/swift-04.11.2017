package Task4_Market;

public class Product {

    private String name;
    private double price;
    private Product[] products = new Product[500];

    public Product(String name, double price) {
        if (!name.equals("")) {
            this.name = name;
        } else {
            System.err.println("Name can’t be empty.");
            return;
        }
        if (price > 0) {
            this.price = price;
        } else {
            System.err.println("Balance can’t be negative.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
