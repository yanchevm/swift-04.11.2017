import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4_CountryTour2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of cities:");
        int n = sc.nextInt();

        Integer[] distances = new Integer[n];
        Integer[] foods = new Integer[n];
        // or ArrayList, LinkedList
        //LinkedHashMap /index?

        System.out.println("For each town enter the distance to the next town and the amount of food /in days/:");
        String input = sc.nextLine();
        int towns = 0;
        int ind = 0;
        while (true) {
            if (towns >= n){
                break;
            }

            String[] parts = input.split(" ");

            distances[ind] =Integer.parseInt(parts[0]);// NumberFormatException???
            foods[ind] = Integer.parseInt(parts[1]);
            ind ++;
           input = sc.nextLine();
        }

        int hrana = 0;
        int count = 0; //da se zavarti n pati max
        int index = 0; //ot koi index zapochva

        while (true) {
            if(count>=n){
                System.out.println("NO");
                break;
            }
            for (int i = index, j=0; j < n; i++,j++) { //j- br.gradove, i - tekusht index
                hrana = hrana - distances[i]+ foods[i];
                if (hrana >=0){
                    if (index == n-1){//ako e na posl.element, prodyljava s 1-via
                        index =0;
                    }
                    if(j==(n-1)){//ako e minalo n elementa
                        System.out.println(index);
                        return;
                    }
                    continue;
                }
                else{ //hrana <0
                    if (i<n-1){
                        index = i+1; //zapochva proverka ot nachalo ot sledv.grad
                        break;
                    }else{//i==n-1
                        index = 0;
                        break;
                    }
                }

            }

        }

    }
}
