package com.company;

public class Calculator {
	// Милен: Защо ти трябват тези стойности ? Ти ги подаваш като параметри на методите :)
        private String command;
        private double a;
       private double b;

    Calculator(String command, double a, double b){
	// Милен: Тук е обратно! :)
	// this.command = command; -> записваш новата стойност на променливата на обекта.         
	command = this.command; 
        a = this.a; 
        b = this.b;
    }

    public double sum(double a, double b){
        return a+b;
    }
    public double substract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
    public double percentage(double a, double b){
        return (b/100)*a;
    }

    public double getA(double a){
        return a;
    }

    public double getB(double b){
        return b;
    }
    public String getCommand(String command){
        return command;
    }


}
