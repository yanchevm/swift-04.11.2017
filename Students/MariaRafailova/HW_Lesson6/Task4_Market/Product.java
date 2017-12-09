package Task4_Market;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        if(!name.equals("")){ //Милен: Има по-лесен начин, който се предоставя от класа Стринг.
            this.name = name;
        }else {
            System.err.println("Name can’t be empty.");
            return;
        }
        if(price>0){
            this.price = price;
        }else {
               System.err.println("Price can’t be negative.");
               return;
           }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
