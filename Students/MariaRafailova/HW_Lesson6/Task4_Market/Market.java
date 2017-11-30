package Task4_Market;

import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] persons = new Person[200];
        Product[] products = new Product[500];

        System.out.println("Please enter a sequence of \"PersonName = money\",separated by semicolon: ");
        String strPer = sc.nextLine();
        String[] arrPer = strPer.split(";");
        for (int i = 0; i < arrPer.length; i++) {
            String[] partsPer = arrPer[i].split("=");
            persons[i] = new Person(partsPer[0],Double.parseDouble(partsPer[1]));
        }

        System.out.println("Please enter a sequence of \"ProductName = price\", separated by semicolon: ");
        String strProd = sc.nextLine();
        String[] arrProd = strProd.split(";");
        for (int i = 0; i < arrProd.length; i++) {
            String[] partsProd = arrProd[i].split("=");
            products[i] = new Product(partsProd[0],Double.parseDouble(partsProd[1]));
        }

        System.out.println("Enter Buying operations in format: \"PersonName ProductName\"");
        String strBuy = sc.nextLine();
        do {
            if(strBuy.equals("END")){
                break;
            }
          String[] arrBuy = strBuy.split(" ");
            if(arrBuy.length == 2){
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].getName().equals(arrBuy[0])){
                        for (int j = 0; j < products.length; j++) {
                            if(products[j].getName().equals(arrBuy[1])){
                                if( products[j].getPrice() <= persons[i].getBalance()){
                                    persons[i].addProduct(products[j]);
                                    System.out.println(persons[i].getName()+" bought "+products[j].getName());
                                    break;
                                } else{
                                    System.out.println(persons[i].getName()+" can’t afford "+products[j].getName());
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            if(arrBuy.length == 3){
                for (int i = 0; i < persons.length; i++) {
                    String name = arrBuy[0] + " " + arrBuy[1];
                    if (persons[i].getName().equals(name)){
                        for (int j = 0; j < products.length; j++) {
                            if(products[j].getName().equals(arrBuy[2])){
                                if( products[j].getPrice() <= persons[i].getBalance()){
                                    persons[i].addProduct(products[j]);
                                    System.out.println(persons[i].getName()+" bought "+products[j].getName());
                                    break;
                                } else{
                                    System.out.println(persons[i].getName()+" can’t afford "+products[j].getName());
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }

            System.out.println("Enter Buying operations in format: \"name product_name\"");
            strBuy = sc.nextLine();
        }while (true);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null){
                persons[i].printInfo();
            }
        }
    }
}
