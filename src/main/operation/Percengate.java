package main.operation;

public class Percengate extends AbstractOperation {
    {
        name = "Szazalek szamitas";
    }

    @Override
    public double executeCalculation(int firstOperand, int secondOperand) {
        return 100d * firstOperand / secondOperand;
    }
}
