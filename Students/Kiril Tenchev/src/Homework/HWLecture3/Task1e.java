package Homework.HWLecture3;
import java.util.Scanner;
public class Task1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        boolean prime=true;
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(!prime);
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(!prime);
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(prime); }
        }


    }

}
