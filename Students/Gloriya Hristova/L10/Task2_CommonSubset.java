package data_structures;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;


public class Task2_CommonSubset {
    
    private static void printList(List<Integer> list) {
        list.forEach((i) -> { //Милен: БРАВО!
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
               if(Objects.equals(i, j)){ //Милен: Няма нужда от това. Можеш да използваш просто: i == j
                   common.add(i);
               }
            }
        });


	// Милен: Вижда, че използваш ламбра изрази, но си го направила полвинчато. Ето как можеш да го направиш изцяло:
	/*
	List<T> common = listM.stream()
		                 .filter(listN::contains)
		                 .collect(Collectors.toList());
        */

        if(common.isEmpty()){
            System.out.println("NO");
        }
        else{
            printList(common);
        }
    } 
}
