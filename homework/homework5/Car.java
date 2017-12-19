package homework.homework5;

/**
 * Created by Admin on 1.12.2017 г..
 */
public class Car {
    private String mark;
    private String model;
    private int yearOfManufacture;
    private final int lastYearOfManufactoru = 2017;
    private int hoursePower;


    public Car(String mark, String model, int yearOfManufacture, int hoursePower) {
        this.mark = mark;
        this.mark = model;
        this.yearOfManufacture = yearOfManufacture;
        this.hoursePower = hoursePower;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    public void display() {
        System.out.printf("Mark:%s\nModel:%s\nYear:%d\nHp:%d\n", mark, model, yearOfManufacture, hoursePower);
    }

    public int insuranceCategory() {
        if (lastYearOfManufactoru - yearOfManufacture <= 8)
            return 1;
        if (lastYearOfManufactoru - yearOfManufacture >= 8 && lastYearOfManufactoru - yearOfManufacture <= 15)
            return  2;
        if (lastYearOfManufactoru - yearOfManufacture >= 15 && lastYearOfManufactoru - yearOfManufacture <= 25)
            return 3;
      else
            return 4;

    }

    public void sumOfTax() {
        int categoria = insuranceCategory();
        double tax=0.0 ;
        switch (categoria) {
            case 1:
                tax = 150;
                break;
            case 2:
                tax=200;
                break;
            case 3:
                tax=300;
                break;
            case 4 :
                tax=500;
                break;
        }
        if (hoursePower<80) {
            tax += 0.2 * tax;
        }
        else if (hoursePower>140) {
            tax += tax * 0.45;
        }
        System.out.println(tax);
    }
}
