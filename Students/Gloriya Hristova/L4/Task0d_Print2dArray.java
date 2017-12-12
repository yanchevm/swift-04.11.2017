package matrix;

public class Task0d_Print2dArray {
   
    public static void main(String [] args){
        int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        /*int a = 1;
      int array[][] = new int[4][4];
      for(int i = 0; i<4; i++){
          for(int j=0; j<4; j++){
              array [i][j] = a;
              a++;
          }
      }*/
     for(int i = 0; i<4; i++){
          for(int j=0; j<4; j++){
              System.out.print(array[i][j]+"\t");
          }System.out.println();
      }
     
      
    }
}
