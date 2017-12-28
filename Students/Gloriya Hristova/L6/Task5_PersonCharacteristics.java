package objects;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task5_PersonCharacteristics {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        String name, surname, gnd, _height, institution;
        String dateOfBirth = "default", dateOfEnrollment, dateOfGraduation = "default";
        char gender;
        String status;
        
        int age,grad;
        String finalGrade ="default";
        int NPeople;
        
        NPeople = input.nextInt();
        for(int i=0; i<NPeople;i++){
            String text = txt.nextLine();
            String[] wordArray = text.trim().split(";");
            name = wordArray[0];
            surname = wordArray[1];
            gnd=wordArray[2];
            _height= wordArray[3];
            dateOfBirth= wordArray[4];
            institution=wordArray[5];
            dateOfEnrollment = wordArray[6];
            dateOfGraduation = wordArray[7];
            gender = gnd.charAt(0);
            
            LocalDate now = LocalDate.now(ZoneId.of("Europe/Paris"));
            DateTimeFormatter dTF = DateTimeFormatter.ofPattern("d.M.uuuu");
            
            LocalDate locDateBirth = LocalDate.parse(dateOfBirth,dTF);
            age = (int ) java.time.temporal.ChronoUnit.YEARS.between(locDateBirth, now);
            
            LocalDate locDateGrad = LocalDate.parse(dateOfGraduation,dTF);
            grad = (int)java.time.temporal.ChronoUnit.YEARS.between(locDateGrad, now);
            
            if(grad<0){
                status = "is supposed to graduate";
            }
            else{
                status = "finished";
            }
            
            if(status.equals("finished")){
                finalGrade = wordArray[8];
                float grade = Float.parseFloat(finalGrade);
                finalGrade = String.format("%.3f", grade);
            }
            
            LocalDate enrollment =LocalDate.parse(dateOfEnrollment,dTF);
            
            if(gender=='M'){
                System.out.print("\n"+name+" "+surname+" is "+age+" years old. "
                        + "He was born in "+locDateBirth.getYear()+". He started "+institution+
                        " on "+enrollment+" and "+status+" on "
                        +locDateGrad);
            }
            else{
                System.out.print("\n"+name+" "+surname+" is "+age+" years old. "
                        + "She was born in "+locDateBirth.getYear()+". She started "+institution+
                        " on "+enrollment+" and "+status+" on "
                        +locDateGrad);
            }
            if(status.equals("finished")){
                System.out.print(" with a grade of "+finalGrade+". ");
            }
            else{
                System.out.print(". ");
            }   
            if(age<18){
                System.out.print(name+" "+surname+" is underaged.");
            }
            System.out.println();
        } 
    } 
}