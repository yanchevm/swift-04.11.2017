package task0_classes;

import java.time.Year;
import java.util.Scanner;

class Car {
  String brand, model;
  int horsepow, yearOfProd,age;
  double tax;
  int insuranceCat;
  int today = Year.now().getValue();
  int age(int yearOfProd) {
      age=today- yearOfProd;
          return age;}
  void insuranceCategory(int age){
      if(age<=8){
          insuranceCat=1;
      }
       if(age>8&&age<=15){
          insuranceCat=2;
      }
        if(age>15&&age<=25){
          insuranceCat=3;
      }
         if(age>25){
          insuranceCat=4;
      }System.out.println(insuranceCat);
  }
  double tax(int insuranceCat){
      switch(insuranceCat){
          case 1: tax =150;break;
          case 2: tax =200;break;
          case 3: tax =300;break;
          case 4: tax =500;break;
      }
          if(horsepow<80){
              tax*=1.2;
          }
          if(horsepow>140){
              tax*=1.45;
          }
      
  return tax;}
  void setCarSpecifications(String brand, String model, int horsepow, int yearOfProd){
      
           this.brand =brand;
           this.model=model;
           this.horsepow=horsepow;
           this.yearOfProd= yearOfProd;
            
        }
}

public class Main {
   public static void main(String [] args){
       Car vehicle = new Car();
       System.out.print("Car brand: ");
            Scanner input = new Scanner(System.in);
            vehicle.brand = input.nextLine();
            System.out.print("Car model: ");
            vehicle.model = input.nextLine();
            System.out.print("Year of production: ");
            vehicle.yearOfProd = input.nextInt();
            System.out.print("Horsepower: ");
            vehicle.horsepow = input.nextInt();
       vehicle.setCarSpecifications(vehicle.brand,vehicle.model,vehicle.horsepow,vehicle.yearOfProd);
       
       
       int x;
       x=vehicle.age(vehicle.yearOfProd);
       vehicle.insuranceCategory(x);
       System.out.println(vehicle.tax(vehicle.insuranceCat));
         
   } 
}

