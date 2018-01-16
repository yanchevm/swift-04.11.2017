package Homework.HWLecture6.Credentials;

import java.util.*;
import java.util.Scanner;

public class Credentials {
    //Scanner sc = new Scanner(System.in);

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

    //Милен: Тук освен паролата, сигурно ще искаш да провериш, че името също е коректно
// Примерно:
    public void auth(String userName, String password) {
        if (! userName.equals(username)) {
            System.out.println("Incorect UserName " + userName);
            return;  // По този начин приключвам с изпълнението на метода! Освен това го правя без големи if-else констрикции!
        }

        if (password == null || password.isEmpty()) {
            System.out.println("Incorect password " + password);
            return;
        }

        if (!password.equals(currentPassword)) {
            System.out.println("AUTH fail");
            return;
        }

        System.out.println("AUTH success");
    }



    //Милен: Трябва да проверяваш и името! Може, потребител с грешно име да смени паролата!
    public void chpass(String newPassword){
        // Милен: Един метод ТРЯБВА да прави само ЕДНО нещо! При теб, ти освен бизнес логиката, четеш и от конзолата!
        // Защо четеш от конзолата нова парола, при положение, че си я подал като параметър ?

        if (newPassword.equals(currentPassword)){ //Милен: Аз бих сложил това условие първо. По този начин, ако е равна, няма да си преминал 2 пъти през лист-а от пароли да сравняваш. Ще стане по-оптимално.
            System.err.println("New password must be different form current!");
        }
        else if (allPasswords.contains(newPassword)){
            System.err.println("New password must be different from others!");
        }
        else if(!allPasswords.contains(newPassword)&&!newPassword.equals(currentPassword)){
            currentPassword=newPassword;
        }



    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
