package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Credentials {

    TreeMap<String, String> usersAndPasswords;


    public Credentials(){
       usersAndPasswords = new TreeMap<>();
    }

    public void enroll( String password, String username){

        if (usersAndPasswords.containsValue(username)) {
            System.out.printf("ENROLL fail%n");
        } else
            usersAndPasswords.put(password, username);
            System.out.printf("ENROLL success%n");
    }

    public void changepass(String password, String username, String newPassword) {
	// Милен: Ами ако има двама потребителя с еднаква парола ?
        if (usersAndPasswords.containsKey(password)) {
            usersAndPasswords.replace(password, username, newPassword);
            System.out.printf("CHPASS success%n");
        } else
            System.out.println("CHAPSS fail%n");

    }
    public void authenticate(String password, String username){
        if (usersAndPasswords.containsValue(username) && usersAndPasswords.get(username).equals(password)){
            System.out.printf("AUTH success%n");
        } else
            System.out.printf("AUTH fail%n");
        }


    public Map<String, String> getUsersAndPasswords(){
        return usersAndPasswords;
        }




}
