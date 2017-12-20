package data_structures;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;


public class Task2_CommonSubset {
    
    private static void printList(List<Integer> list) {
        list.forEach((i) -> {
            System.out.print(i + " ");
        });
        
        System.out.println();
    }

    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter M and N: ");
        String num = input.nextLine();
        String numbersM, numbersN;
        String parts[] = num.trim().split(" ");
        int M,N;
                M = Integer.parseInt(parts[0]);
                N = Integer.parseInt(parts[1]);
        
        List <Integer> listM = new ArrayList<>();
        numbersM = input.nextLine();
        String[] partsM = numbersM.trim().split(" ");
        for(int i = 0; i < M; i++){
            listM.add(Integer.parseInt(partsM[i]));
        }
        
        List <Integer> listN = new ArrayList<>();
        numbersN = input.nextLine();
        String[] partsN = numbersN.trim().split(" ");
        for(int i = 0; i < N; i++){
            listN.add(Integer.parseInt(partsN[i]));
        } 
        
        List <Integer> common = new ArrayList<>();
        listM.forEach((i)->{
            for(Integer j:listN){
               if(Objects.equals(i, j)){
                   common.add(i);
               }
            }
        });
        
        if(common.isEmpty()){
            System.out.println("NO");
        }
        else{
            printList(common);
        }
    } 
}
