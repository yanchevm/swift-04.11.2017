package Task2_CredentialsManager;

import sun.security.util.Password;

public class Credentials {

    private final String username;
    private String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //Милен: Никаде не запазваш потребителското име и парола.
    public String enroll(String enrollUsername, String enrollPassword) {
        if (enrollPassword.equals(password) && enrollUsername.equals(username)) {
            System.out.println("ENROLL success");
            return "success";
        } else {
            System.out.println("ENROLL fail");
            return "fail";
        }
    }

    //Милен: Каде запазваш старите пароли ? 
    public String chpass(String chpassUser, String chpassOldPass, String chpassNewPass) {
        if (chpassUser.equals(username) && chpassOldPass.equals(password)) {
            password = chpassNewPass.replace(password, chpassNewPass); //Милен: Защо е това ? 
            System.out.printf("CHPASS success. New password - %s %n", password);
            return "success";
        } else {
            System.out.println("Invalid username or password");
            return "fail";
        }
    }

    public String auth(String authUser, String authPassword) {
        if (authUser.equals(username) && authPassword.equals(password)) {
            System.out.println("AUTH success");
            return "success";
        } else {
            System.out.println("AUTH fail");
            return "fail";
        }
    }
}
