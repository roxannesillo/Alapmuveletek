package main.operation;

public abstract class AbstractOperation implements Operation {

    // csak packagen belul lathato
    String name;

    public String getName() {
        return name;
    }

   public abstract double executeCalculation(int firstOperand, int secondOperand);

}
