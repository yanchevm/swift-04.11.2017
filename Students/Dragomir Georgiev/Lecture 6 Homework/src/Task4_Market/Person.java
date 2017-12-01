package Task4_Market;

public class Person {

    private String name;
    private double balance;

    private Product[] products = new Product[500];
    int index = 0;

    public Person(String name, double balance) {
        if (!name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Incorrect name");
        }

        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Not enough money");
        }
    }

    public void addProduct(Product newProduct) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = newProduct;
                this.balance -= newProduct.getPrice();
                break;
            }
        }
    }

    public boolean isEmpty() {
        if (products[0] != null) {
            return false;
        }
        return true;
    }

    public void printInfo() {
        System.out.print(this.name + " - ");
        if (this.isEmpty()) {
            System.out.println("Nothing bought");
        } else {
            for (int i = 0; i < products.length; i++) {
                if (products[i] != null) {
                    if (products[i + 1] == null) {
                        System.out.print(products[i].getName());
                    } else {
                        System.out.println(products[i].getName() + ", ");
                    }
                }
            }
        }

    }
}
