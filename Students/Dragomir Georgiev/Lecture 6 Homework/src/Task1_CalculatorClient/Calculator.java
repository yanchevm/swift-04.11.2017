package Task1_CalculatorClient;

public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double a() { //Милен: Свойствата се записват с get, set, is и след това името на характеристиката - getA, getB, setA, setB ... 
        return a;
    }

    public double b() {
        return b;
    }


    public void sum() {
        double sumAB = a + b;
        System.out.printf("The sum of %.3f + %.3f equals %.3f %n", a, b, sumAB);
    }

    public void substract() {
        double substractAB = a - b;
        System.out.printf("The sum of %.3f - %.3f equals %.3f %n", a, b, substractAB);
    }

    public void multiply() {
        double multiplyAB = a * b;
        System.out.printf("The sum of %.3f * %.3f equals %.3f %n", a, b, multiplyAB);
    }

    public void divide() {
        double divideAB = a / b;
        System.out.printf("The sum of %.3f / %.3f equals %.3f %n", a, b, divideAB);
    }

    public void percentage() {
        double percentageAB = (a / b) / 100;
        System.out.printf("%.3f equals to %.3f percent of %.3f %n", b, percentageAB, a);
    }

    public void end() {
        System.out.println("Please close the app");
    }


}
