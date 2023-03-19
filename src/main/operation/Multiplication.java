package main.operation;

public class Multiplication extends AbstractOperation {


    Multiplication(){
        name = "Szorzas";
    }
    @Override
    public double executeCalculation(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
}
