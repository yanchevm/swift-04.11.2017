package matrix;

import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        StringBuilder encode = new StringBuilder();
        StringBuilder decode = new StringBuilder();
        String text, command;
        String encoded, decoded;
        int length, letter;
        do{
            text = input.nextLine();
            if(text.matches(".*\\d+.*")){
                System.out.println("Enter valid text input:");
            }
        }while(text.matches(".*\\d+.*"));
        do{
            command = input.nextLine();
            if(!command.equals("encode")&&!command.equals("decode")){
                System.out.println("Enter a valid encode/decode command!");
            }
        }while(!command.equals("encode")&&!command.equals("decode"));
        
        if(command.equals("encode")){
            length = text.length();
            for(int i =0;i<length;i++){
                letter = text.charAt(i);
                if(letter =='z'){
                    letter ='a';
                }
                if(letter =='Z'){
                    letter ='A';
                }
                if(letter !=' '){
                    letter+=1;
                }
                encoded = Character.toString((char)letter);
                encode = encode.append(encoded);
            }
            System.out.println(encode);
        }
        if(command.equals("decode")){
            length = text.length();
            for(int i =0;i<length;i++){
                letter = text.charAt(i);
                if(letter =='a'){
                    letter ='z';
                }
                if(letter =='A'){
                    letter ='Z';
                }
                if(letter ==' '){
                }
                else{
                    letter-=1;
                }
                decoded = Character.toString((char)letter);
                decode = encode.append(decoded);
            }
            System.out.println(encode);   
        }
    }
}
