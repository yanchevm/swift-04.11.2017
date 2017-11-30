package Credentials;

public class Credentials {
    private String username;
    private String pass;
    private boolean wrongPass= false;

    String[] passwords = new String[100];

            public Credentials(String name, String password){
                this.username = name;
                this.pass = password;
    }

            public void setPassword(String pass1, String pass2) {
                if (this.checkPassword(pass1)){
            for (int i = 0; i <passwords.length; i++) {
                if (passwords[i]==pass) {
                    this.wrongPass = true;
                    break;
                }
            }
            if(this.wrongPass = false){
                this.pass =pass2;
            }
        }
    }

    public boolean checkPassword(String password){
        if (this.pass.equals(password)){
            return true;
        }else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean getWrongPass2(){
        return this.wrongPass;
    }
}
