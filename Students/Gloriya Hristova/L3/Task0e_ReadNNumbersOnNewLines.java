package mypack;

import java.util.Scanner;


public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String [] args){
         Scanner input = new Scanner(System.in);
    
         int array[];
         double arr[];
         int n;
         n=5;
         String answer;
        array = new int [n];
      arr = new double[n];
      System.out.println("Numbers: int or double? ");
        answer = input.nextLine();
         
do{   

         System.out.println("Enter number of entries: ");
        n = input.nextInt();
        }while(n<=0);
         System.out.println("Enter numbers: ");
       if (answer.equals("int")){  
           for(int i = 0; i <n; i++){
               array[i] = input.nextInt();
          
         }
	//Милен: БРАВО!
         for(int i = 0; i <n; i++){
            System.out.print(array[i]+" "); 
         }}else{
                 for(int i = 0; i <n; i++){
            arr[i] = input.nextDouble();
            
         }
         
         for(int i = 0; i <n; i++){
            System.out.print(arr[i]+" "); 
         } 
    

}
       System.out.println();
}
   
}

