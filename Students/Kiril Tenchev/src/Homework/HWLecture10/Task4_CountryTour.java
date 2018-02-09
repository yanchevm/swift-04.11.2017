package Homework.HWLecture10;

import java.util.Scanner;

public class Task4_CountryTour {
	//Милен: БРАВО, добре си се справил.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many information for cities would you enter: ");
        int n = sc.nextInt();
        int cityNumber = 0;
        int citiesFood [][]= new int [n][2];
        for (int i = 0; i <n ; i++) {
            cityNumber++;
            System.out.print("Enter information for city #"+cityNumber+":");
            for (int j = 0; j <2 ; j++) {
                citiesFood[i][j]=sc.nextInt();
            }
        }
        int foodAll=0;
        int cityAll=0;
        for (int i = 0; i <n ; i++) {
             foodAll += citiesFood[i][1];
        }

        for (int i = 0; i <n ; i++) {
            cityAll += citiesFood[i][0];
        }

        int currentBiggerFood=0;

        if (foodAll>=cityAll){
            for (int i = 0; i <n-1 ; i++) {
            if (citiesFood[i][1]<citiesFood[i+1][1]){
                currentBiggerFood=i+2;
            }
        }
            System.out.println(currentBiggerFood);
        }
        else{
            System.out.println("NO");
        }
    }
}
