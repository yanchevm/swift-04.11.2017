package data_structures;

import java.util.Scanner;

public class Task6_WordReplacement {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Милен: Защо не използваш само един скенер ?
        Scanner n = new Scanner(System.in);
        String text,txt;
        String[] parts = null;
        int counter=0;
        text = input.nextLine();
        text.trim();
        for (int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                counter++;
            }
        }
        int N;
        N=n.nextInt();
        String[][] fragment=new String[N][2];
        parts=text.split(" ");
        for(int i = 0;i<N;i++){
            txt=input.nextLine();
            fragment[i] = txt.trim().split(" ");
        }
        for(int i = 0;i<N;i++){
            for (int j=0;j<counter;j++){
                if(parts[j].toLowerCase().equals(fragment[i][0].toLowerCase())){
                    parts[j]=fragment[i][1];
                    i++;
                } 
            }
        }
        for (int j=0;j<=counter;j++){
            System.out.print(parts[j]+" ");
        }
        System.out.println();
    }
}
