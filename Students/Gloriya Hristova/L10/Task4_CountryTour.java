package data_structures;

import java.util.Scanner;

public class Task4_CountryTour {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        int N;
        String info;
        N = input.nextInt();
        int[] distance= new int[N];
        int[] food = new int[N];
        for(int i = 0; i<N;i++){
            info = line.nextLine();
            info.trim();
            String[]facts = info.split(" ");
            distance[i] = Integer.parseInt(facts[0]);
            food[i] = Integer.parseInt(facts[1]);
        }
        int index = 0,counter = 0,sum = 0;
        for(int i = 0; i < N; i++){
            sum = sum - distance[i] + food[i];
        }
        if(sum<0){
            System.out.println("NO.");
            System.exit(0);
        }
        sum=0;
        for(int i = index; counter < N; i++){
            sum = sum -distance[i] + food[i];
            if (sum < 0){
                counter = 0;
                sum = 0;
                index = ++i;
            }
            if(i == N - 1 && counter < N - 1){
                i = 0;
                sum += food[i] - distance[i];
            }
            counter++;
        }
        System.out.println(index+1);
    }
}   