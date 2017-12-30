package Homework.HWLecture6.Calculator;

public class Calculator {
    private double parameterA;
    private double parameterB;

    public double sum(double parameterAvalue,double parameterBvalue){
        return parameterAvalue+parameterBvalue;
    }
    public double subtract(double parameterAvalue,double parameterBvalue){
        return parameterBvalue-parameterAvalue;
    }
    public double myltiply(double parameterAvalue,double parameterBvalue){
        return parameterAvalue*parameterBvalue;
    }
    public double divide(double parameterAvalue,double parameterBvalue){
        return parameterAvalue/parameterBvalue;
    }
    public double percentage(double parameterAvalue,double parameterBvalue){
        return (parameterAvalue/100)*parameterBvalue;
    }
    public void setParameterA(double parameterAvalue) {
        this.parameterA = parameterAvalue;
    }

    public void setParameterB(double parameterBvalue) {
        this.parameterB = parameterBvalue;
    }

    public double getParameterB() {
        return this.parameterB;
    }

    public double getParameterA() {
        return this.parameterA;
    }
}
