package Task4_Market;

public class Person {

    private String name;
    private double balance;

    private Product[] products = new Product[500];
    int index = 0;

    public Person(String name, double balance) {
        if (!name.equals("")) { //Милен: Провери дали String няма метод който да върши тази работа.
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
        for (int i = 0; i < products.length; i++) { //Милен: Можеш ли да оптимизираш това ? Защо ти е цикъл само за да знаеш на кой индекс да поставиш новия продукт ?
            if (products[i] == null) {
                products[i] = newProduct;
                this.balance -= newProduct.getPrice();
                break;
            }
        }
    }

    public boolean isEmpty() {
        if (products[0] != null) { //Милен: Използвай products.length вмето това.
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
                if (products[i] != null) { // Използвай for-each и няма да се налага да правиш проверка за null
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
