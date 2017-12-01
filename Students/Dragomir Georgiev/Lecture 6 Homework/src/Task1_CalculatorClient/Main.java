package Task1_CalculatorClient;

public class Main {

    public static void main(String[] args) {


        Calculator calculator1 = new Calculator(10, 5);

        calculator1.sum();
        calculator1.substract();
        calculator1.multiply();
        calculator1.divide();
        calculator1.percentage();
        calculator1.end();


    }
}
