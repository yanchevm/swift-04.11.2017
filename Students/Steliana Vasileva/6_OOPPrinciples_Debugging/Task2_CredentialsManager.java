package com.company;

import java.util.*;

public class Task2_CredentialsManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Credentials credentials1 = new Credentials ();

        String command = sc.next();

        while (command != "END"){

            String username = sc.next();
            String password = sc.next();
            String newPassword = sc.next();


            if (command.equals("ENROLL")) {
                credentials1.enroll(password, username);

            } else if (command.equals("CHPASS")) {
                credentials1.changepass(password, username, newPassword);

            } else if (command.equals("AUTH")) {
                credentials1.authenticate(password, username);
            }

        }
    }

}



