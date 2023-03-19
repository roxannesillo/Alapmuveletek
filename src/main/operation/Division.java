package main.operation;

public class Division extends AbstractOperation {


    Division(){
        name = "Osztas";
    }

    @Override
    public double executeCalculation(int firstOperand, int secondOperand) {
        return 1d * firstOperand / secondOperand;
    }
}
