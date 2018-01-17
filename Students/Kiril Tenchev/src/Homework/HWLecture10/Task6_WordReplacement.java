package Homework.HWLecture10;

import java.util.Scanner;

public class Task6_WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String str = sc.nextLine();
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        String [][]  replaceWords = new String[n][2];
        for (int i = 0; i < replaceWords.length; i++) {
            System.out.print("Enter 2 words : ");
            for (int j = 0; j <2 ; j++) {
                replaceWords[i][j]=sc.next();
            }
        }
        String words [] = str.split(" ");
	// Милен: Малко неконсистентно ги пишеш тези масиви... 
	// Най-добрата практира е : String[] words

	// Милен: БРАВО, алгоритъма е правилен
        for (int i = 0; i <replaceWords.length ; i++) {
            for (int j = 0; j <words.length ; j++) {
                if (words[j].equalsIgnoreCase(replaceWords[i][0])){
                    words[j]= replaceWords[i][1];

                }
            }

        }
        for (int i = 0; i <words.length ; i++) {
            System.out.print(words[i]+" ");
        }
    }
}




