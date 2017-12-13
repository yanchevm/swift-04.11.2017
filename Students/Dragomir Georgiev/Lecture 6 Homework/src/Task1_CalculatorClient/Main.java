package Task1_CalculatorClient;

public class Main {

    public static void main(String[] args) {

	//Милен: Браво, добре си го написал, но не е точно с условието. 
	// Програмта трябва да чете от конзолата операция и операнди, докато се въведе 'END'
        Calculator calculator1 = new Calculator(10, 5);

        calculator1.sum();
        calculator1.substract();
        calculator1.multiply();
        calculator1.divide();
        calculator1.percentage();
        calculator1.end();


    }
}
