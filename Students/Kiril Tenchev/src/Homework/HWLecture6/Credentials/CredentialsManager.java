//package Homework.HWLecture6.Credentials;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class CredentialsManager {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What would you like to do (create user,change password,check password): ");
//        String str=sc.nextLine();
//        List <Credentials> credentialsList = new ArrayList<>(200);
//        while (!str.equals("END")) {
//            String[] arr = str.split(" ");
//            String opearation  = arr[0];
//            String name;
//            String pass;
//                switch (opearation) {
//                    case "ENROLL":
//                        // Enshure capacity!!!
////                        credentialsList.size() == 200 -- notify user!
////                        Credentials p1 = new Credentials(name, pass);
//                        name = arr[1];
//                        pass = arr[2];
//
//                        credentialsList.add(new Credentials(name, pass));
//                        break;
//                    case "CHPASS":
//                        name = arr[1];
//                        pass = arr[2];
//                        String newPass = arr[3];
//
//                        Credentials credentials = null;
//
//                        for (Credentials c : credentialsList) {
//                            if (c.getUsername().equals(name)) {
//                                credentials = c;
//                                break;
//                            }
//                        }
//
//                        credentials.chpass(newPass);
//
//                        break;
//                    case "AUTH":
//                        name = arr[1];
//                        pass = arr[2];
//                        credentialsList.get(credentialsList.lastIndexOf(credentialsList));
//
//                    default:
//                        System.out.println("some err");
//                }
//                System.out.println("Enter operation: ");
//                str = sc.nextLine();
//        }
//
//
//
//    }
//}
