package Homework.HWLecture16.Task0;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Service service = new Service();

        System.out.println("------ Press 1 to add actor ------");
        System.out.println("------ Press 2 to connect actor to movie ------");
        System.out.println("------ Press 0 to exit ------");

        int input = -1;

        while (input!=0){
            System.out.println("\n------ Enter command ------");

            input = sc.nextInt();

             if(input==1){
                service.addActor();
             }
             else if (input==2){
                service.addActorToFilm();
             }



        }





    }
}
