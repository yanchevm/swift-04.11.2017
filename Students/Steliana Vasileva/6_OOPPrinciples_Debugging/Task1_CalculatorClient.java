package com.company;

import java.util.Scanner;

public class Task1_CalculatorClient {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Calculator calculator1 = new Calculator(sc.next(), sc.nextDouble(), sc.nextDouble());

        String command;

        do {

           command = sc.next();
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            switch (command){
                case "SUM":

                    System.out.printf("%.3f%n", calculator1.sum(a,b));
                    break;

                case "SUB":

                    System.out.printf("%.3f%n", calculator1.substract(a,b));
                    break;

                case "MUL":

                    System.out.printf("%.3f%n", calculator1.multiply(a,b));
                    break;

                case "DIV":

                    System.out.printf("%.3f%n", calculator1.divide(a,b));
                    break;

                case "PER":

                    System.out.printf("%.3f%n", calculator1.percentage(a,b));
                    break;

            }

        } while (command!= "END");





        }



    }




