import java.util.Arrays;
import java.util.Scanner;




public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Client[] clients = new Client[1000];
        Account[] accounts = new Account[1000];
        int[] ibanArr = new int[8];

        System.out.println("Please enter a command and information needed: ");
        String str = sc.nextLine();
        
        //Милен: БРАВО, много ми харесва!
        while (true){
            if(str.equals("END")){
                break;
            }

            String[] parts = str.split(" ");

            switch (parts[0]){
                //Милен: Това защо не го изнесеш в един метод ?
                case "OPEN":
                    for (int i = 0; i < clients.length; i++) {
                        if(clients[i]==null){ //Милен: Тук това можеш ли да го направиш с ArrayList структура ?
                            if(parts[2].equals("1")){
                                clients[i] = new Client(parts[1]) {
                                };
                            }else {
                                clients[i] = new CompanyCustomer(parts[1]);
                            }

                            if(parts[3].equals("1")){
                                accounts[i] = new DepositAccount(clients[i],Double.parseDouble(parts[4]),
                                        Double.parseDouble(parts[5]));
                            }else if(parts[3].equals("2")){
                                accounts[i] = new LoanAccount(clients[i],Double.parseDouble(parts[4]),
                                        Double.parseDouble(parts[5]));
                            }else {
                                accounts[i] = new MortgageAccount(clients[i],Double.parseDouble(parts[4]),
                                        Double.parseDouble(parts[5]));
                            }
                            accounts[i].printIban();
                            break;
                        }
                    }
                    ;break;
                case "PUT":

                    for (int i = 0; i < clients.length; i++) {
                        if(parts[1].equals(clients[i].getName())){
                            accounts[i].put(Double.parseDouble(parts[2]));
                            break;
                        }
                    }



                    ;break;

                case "GET":
                    for (int i = 0; i < clients.length; i++) {
                        if(parts[1].equals(clients[i].getName())){
                            accounts[i].get(Double.parseDouble(parts[2]));
                            break;
                        }
                    }



                    ;break;

                case "INFO":
                    for (int i = 0; i < clients.length; i++) {
                        if(parts[1].equals(clients[i].getName())){
                            accounts[i].info(Integer.parseInt(parts[2]));
                            accounts[i].toString();
                            break;
                        }
                    }


                    ;break;
            }

            System.out.println("Please enter a command and information needed: ");
            str = sc.nextLine();
        }

        for (int i = 0; i < clients.length; i++) {
            if(clients[i] != null){
                System.out.println(clients[i].getName());
            }
        }

        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null){
                System.out.println(accounts[i].toString());
            }

        }

    }
}
