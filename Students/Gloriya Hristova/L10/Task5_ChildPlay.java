package data_structures;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Task5_ChildPlay {
    
    public static void main(String [] args){
        boolean result;
        int i,counter=0;
    
        Scanner input = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        List <Integer> kids = new LinkedList();
        
        int N;
        N = input.nextInt();
        String heights;
        
        heights=h.nextLine();
        String[] heightOfKids = heights.trim().split(" ");
        for(i=0;i<N;i++){
            kids.add(Integer.parseInt(heightOfKids[i]));
        }
        for(int k=0;k<kids.size();k++){
            result=true;
            for(int j = 0;j<kids.size()-1;j++){
                if(kids.get(j) < kids.get(j+1)){
                    kids.remove(j+1);
                    result = false;
                }  
            }
            if(result==true){
                break;
            }
            else{
                counter++;
            }
        }
        System.out.println(counter);
    }
}