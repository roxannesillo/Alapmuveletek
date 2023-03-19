package main.operation;

public class Addition extends AbstractOperation {
    // Konstruktort akkor hasznalunk. ha kivulrol akarjuk befolyasolni a nevet



    Addition(){ // csak packagen belul lehet peldanyositani
        name = "Osszeadas";
    }

    @Override
    public double executeCalculation(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }
}
