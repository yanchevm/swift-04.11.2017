import java.time.Year;

public class Task0_Classes_Car {
    String brand;
    String model;
    double power;
    int yearProduced;

    public Task0_Classes_Car(String brand, String model, double power, int yearProduced){
    brand = this.brand;
    model = this.model;
    power = this.power;
    yearProduced = this.yearProduced;
    }

    protected int getCategory(int category){
        return category;
    }
    protected int getPower(int power){
        return power;
    }

    protected int InsuranceCategory(int yearProduced){
        int category = 0;
       int ageOfCar = Year.now().getValue() - yearProduced;

       if (ageOfCar < 8){
         category = 1;
        } else if (ageOfCar >= 8 && ageOfCar < 15){
           category = 2;
        } else if(ageOfCar >= 15 && ageOfCar < 25){
           category = 3;
        } else if(ageOfCar >= 25){
           category = 4;
       }
       return category;
    }
    public int Tax(int tax){
      if (this.InsuranceCategory(this.yearProduced) == 1) {
          tax = 150;
      } else if ((this.InsuranceCategory(this.yearProduced) == 2)) {
          tax = 200;
        }else if ((this.InsuranceCategory(this.yearProduced) == 3)) {
          tax = 300;
      } else if ((this.InsuranceCategory(this.yearProduced) == 4)){
          tax = 500;
      }
      if (getPower(this.yearProduced) < 80){
          tax+=0.2*tax;
      } else if (getPower(this.yearProduced) > 140){
          tax += 0.45*tax;
      }
      return tax;
    }


    }

