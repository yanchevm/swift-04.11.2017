package com.company;

public class Calculator {



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
