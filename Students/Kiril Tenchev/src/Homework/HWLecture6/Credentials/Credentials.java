package Homework.HWLecture6.Credentials;

import java.util.*;
import java.util.Scanner;

public class Credentials {
    Scanner sc = new Scanner(System.in);

    private String username;
    private String password;
    private ArrayList<String> allPasswords;
    private String currentPassword;

    Credentials (String usernameValue,String passwordValue){
        this.username=usernameValue;
        this.password=passwordValue;
        allPasswords=new ArrayList<>(100);
        currentPassword=passwordValue;
    }

    public boolean auth(String passwordValue){
        if (this.password.equals(currentPassword)){
            return true;
        }
        else {
            return false;
        }

    }
    public void chpass(String newPassword){
        newPassword=sc.nextLine();
        if(!allPasswords.contains(newPassword)&&!newPassword.equals(currentPassword)){
            currentPassword=newPassword;
        }
        else if (allPasswords.contains(newPassword)){
            System.err.println("New password must be different from others!");
        }
        else if (newPassword.equals(currentPassword)){
            System.err.println("New password must be different form current!");
        }

    }

    public void setAllPasswords(ArrayList<String> allPasswords){
        allPasswords.add(this.password);
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
