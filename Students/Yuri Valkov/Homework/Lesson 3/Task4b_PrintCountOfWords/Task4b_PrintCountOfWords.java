package Lesson3.Homework.Task4b_PrintCountOfWords;


import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text here: ");
        String text = sc.nextLine();
            String arr [] = text.split(" ");
            int q = arr.length;
                for (int i=0; i<arr.length; i++) {
                    boolean num = false;
                        //Милен: БРАВО, алгоритъма е правилен!
                        for ( int k =0; k< arr[i].length(); k++) {
                            switch (arr[i].charAt(k)) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    num = true;
                                    break;
                            }
                            if (num) {
                                q -= 1;
                                break;
                            }
                        }
                            }
                            System.out.print(q);
                        }
                }



