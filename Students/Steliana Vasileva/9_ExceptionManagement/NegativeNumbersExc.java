public class NegativeNumbersExc extends Exception {
    int firstNum;
    int secondNum;

    public NegativeNumbersExc(int firstNum, int secondNum){
        this.firstNum=firstNum;
        this.secondNum=secondNum;
    }
}
