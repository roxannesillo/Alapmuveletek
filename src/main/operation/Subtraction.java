package main.operation;

public class Subtraction extends AbstractOperation {


    Subtraction(){
        name = "Kivonas";

    }
    @Override
    public double executeCalculation(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }
}
