public class newException extends Exception {
    int firstNum;
    int secondNum;
     int sumNumber;

    public newException(int firstNum, int secondNum){
       this.firstNum=firstNum;
       this.secondNum=secondNum;
    }
    public String toString(){
        return  "Numbers cannot be equal";
    }

}
