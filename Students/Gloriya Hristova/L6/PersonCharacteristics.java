package mypack;//Version without substraction of dates and handy methods 

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String [] args){
        
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
        Date date = new Date();
        //System.out.println(dateFormat.format(date));
        String dateStr = date.toString();
        
        String [] dateNow = dateStr.split(" ");
        String _dayNow = dateNow[2];
        String _monthNow = dateNow[1];
        String _yearNow = dateNow[5];
        
        int monthNow=0,dayNow=0,yearNow =0;
        dayNow = Integer.parseInt(_dayNow);
        yearNow=Integer.parseInt(_yearNow);
        
        switch(_monthNow){
            case "Jan": monthNow=1; break;
            case "Feb": monthNow=2; break;
            case "Mar": monthNow=3; break;
            case "Apr": monthNow=4; break;
            case "May": monthNow=5; break;
            case "Jun": monthNow=6; break;
            case "Jul": monthNow=7; break;
            case "Aug": monthNow=8; break;
            case "Sep": monthNow=9; break;
            case "Oct": monthNow=10; break;
            case "Nov": monthNow=11; break;
            case "Dec": monthNow=12; break;
        }
        
        Scanner input = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        String name, surname, gnd, _height, institution;
        String dateOfBirth, dateOfEnrollment, dateOfGraduation;
        char gender;
        String status = "default";
        
        int age;
        String finalGrade="default";
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
            int dayBr, monthBr,yearBr=0;
            StringBuilder dayB = new StringBuilder();
            StringBuilder monthB = new StringBuilder();
            StringBuilder yearB = new StringBuilder();
            
            int dayEn=0,monthEn=0,yearEn=0;
            StringBuilder dayE = new StringBuilder();
            StringBuilder monthE = new StringBuilder();
            StringBuilder yearE = new StringBuilder();
            
            int dayGr=0,monthGr=0,yearGr=0;
            StringBuilder dayG = new StringBuilder();
            StringBuilder monthG = new StringBuilder();
            StringBuilder yearG = new StringBuilder();
            
            dateOfBirth =dateOfBirth.trim();
            dayB =dayB.append(dateOfBirth.charAt(0));
            if(dateOfBirth.charAt(1)!='.'){
                dayB=dayB.append(dateOfBirth.charAt(1));
                monthB=monthB.append(dateOfBirth.charAt(3));
                if(dateOfBirth.charAt(4)!='.'){
                    monthB=monthB.append(dateOfBirth.charAt(4));
                    for(int j =6; j<10;j++){
                        yearB.append(dateOfBirth.charAt(j));
                    }
                }
                else{
                    for(int j =5; j<9;j++){
                        yearB.append(dateOfBirth.charAt(j));
                    }
                }
            }
            else{
                monthB=monthB.append(dateOfBirth.charAt(2));
                if(dateOfBirth.charAt(3)!='.'){
                    monthB=monthB.append(dateOfBirth.charAt(3));
                    for(int j =5; j<9;j++){
                        yearB.append(dateOfBirth.charAt(j));
                    }
                }
                else{
                    for(int j =4; j<8;j++){
                        yearB.append(dateOfBirth.charAt(j));
                    }
                }
            }
            dayBr = Integer.parseInt(dayB.toString());
            monthBr = Integer.parseInt(monthB.toString());
            yearBr = Integer.parseInt(yearB.toString());
            
            age= yearNow-yearBr;
            if(monthNow<monthBr){
                age--;}
            if(monthNow==monthBr){
                if(dayNow<dayBr){
                    age--;
                }
            }
            dateOfEnrollment =dateOfEnrollment.trim();
            dayE =dayE.append(dateOfEnrollment.charAt(0));
            if(dateOfEnrollment.charAt(1)!='.'){
                dayE=dayE.append(dateOfEnrollment.charAt(1));
                monthE=monthE.append(dateOfEnrollment.charAt(3));
                if(dateOfEnrollment.charAt(4)!='.'){
                    monthE=monthE.append(dateOfEnrollment.charAt(4));
                    for(int j =6; j<10;j++){
                        yearE.append(dateOfEnrollment.charAt(j));
                    }
                }
                else{
                    for(int j =5; j<9;j++){
                        yearE.append(dateOfEnrollment.charAt(j));
                    }
                }
            }
            else{
                monthE=monthE.append(dateOfEnrollment.charAt(2));
                if(dateOfEnrollment.charAt(3)!='.'){
                    monthE=monthE.append(dateOfEnrollment.charAt(3));
                    for(int j =5; j<9;j++){
                        yearE.append(dateOfEnrollment.charAt(j));
                    }
                }
                else{
                    for(int j =4; j<8;j++){
                        yearE.append(dateOfEnrollment.charAt(j));
                    }
                }
            }
            dayEn = Integer.parseInt(dayE.toString());
            monthEn = Integer.parseInt(monthE.toString());
            yearEn = Integer.parseInt(yearE.toString());
            
            dateOfGraduation =dateOfGraduation.trim();
            dayG =dayG.append(dateOfGraduation.charAt(0));
            if(dateOfGraduation.charAt(1)!='.'){
                dayG=dayG.append(dateOfGraduation.charAt(1));
                monthG=monthG.append(dateOfGraduation.charAt(3));
                if(dateOfGraduation.charAt(4)!='.'){
                    monthG=monthG.append(dateOfGraduation.charAt(4));
                    for(int j =6; j<10;j++){
                        yearG.append(dateOfGraduation.charAt(j));
                    }
                }else{
                    for(int j =5; j<9;j++){
                        yearG.append(dateOfGraduation.charAt(j));
                    }
                }
            }
            else{
                monthG=monthG.append(dateOfGraduation.charAt(2));
                if(dateOfGraduation.charAt(3)!='.'){
                    monthG=monthG.append(dateOfGraduation.charAt(3));
                    for(int j =5; j<9;j++){
                        yearG.append(dateOfGraduation.charAt(j));
                    }
                }
                else{
                    for(int j =4; j<8;j++){
                        yearG.append(dateOfGraduation.charAt(j));
                    }
                }
            }
            dayGr = Integer.parseInt(dayG.toString());
            monthGr = Integer.parseInt(monthG.toString());
            yearGr = Integer.parseInt(yearG.toString());
            
            if (yearNow<yearGr){
                status = "is supposed to graduate";
            }
            else{
                if(yearNow==yearGr){
                    if(monthNow<monthGr){
                        status = "is supposed to graduate";
                    }
                    if(monthNow==monthGr&&dayNow<dayGr){
                        status = "is supposed to graduate";
                    }
                    if(monthNow==monthGr&&dayNow>=dayGr){
                        status = "finished";
                    }
                    if(monthNow>monthGr){
                        status ="finished";
                    }
                }
                if(yearNow>yearGr){
                    status = "finished";
                }
            }
            if(status.equals("finished")){
                finalGrade = wordArray[8];
                float grade = Float.parseFloat(finalGrade);
                finalGrade = String.format("%.3f", grade);
            }
            
            
            if(gender=='M'){
                System.out.print("\n"+name+" "+surname+" is "+age+" years old. "
                        + "He was born in "+yearBr+". He started "+institution+
                        " on "+yearEn+"-"+monthEn+"-"+dayEn+" and "+status+" on "
                        +yearGr+"-"+monthGr+"-"+dayGr);
            }
            else{
                System.out.print("\n"+name+" "+surname+" is "+age+" years old. "
                        + "She was born in "+yearBr+". She started "+institution+
                        " on "+yearEn+"-"+monthEn+"-"+dayEn+" and "+status+" on "
                        +yearGr+"-"+monthGr+"-"+dayGr);
            }
            if(status.equals("finished")){
                System.out.print(" with a grade of "+finalGrade+". ");
            }
            else{
                System.out.print(" .");
            }   
            if(age<18){
                System.out.print(name+" "+surname+" is underaged.");
            }System.out.println();
        } 
    }
}

//Peter;Petrov;M;184;29.12.2002;SOU Pushkin;15.9.2016;20.5.2021
//Peter;Petrov;M;184;9.9.1985;SOU Pushkin;15.9.2000;20.5.2005;5.11
