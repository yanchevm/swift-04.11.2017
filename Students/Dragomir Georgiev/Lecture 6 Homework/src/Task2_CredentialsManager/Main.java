package Task2_CredentialsManager;

public class Main {
    public static void main(String[] args) {

	//Милен: Стойностите трябва да се четат от конзолата, до изписване на 'END'
        Credentials Pesho = new Credentials("igracha", "123456");

	//Милен: Уникални потребители и пароли :)
        Pesho.enroll("igracha", "123456");
        Pesho.chpass("igracha", "123456", "mnogocukam");
        Pesho.enroll("igracha", "mnogocukam");
        Pesho.auth("igracha", "mnogocukam");

        Credentials Penka = new Credentials("sexybeb4e98", "fikistoraro");

        Penka.enroll("sexybeb4e98","fikistoraro");
        Penka.chpass("sexybeb4e98", "fikistoraro", "samomilko");
        Penka.auth("sexybeb4e98", "turbofolk");
    }
}
