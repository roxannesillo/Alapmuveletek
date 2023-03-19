package main;

import main.operation.Operation;
import main.operation.OperationFactory;

public class Main {
    public static void main(String[] args) {

        new Main().run();

    }

    public void run() {
        Printer printer = new Printer();
        UserInput userInput = new UserInput();
        Operation[] operations = OperationFactory.getOperations();
        Data data = new Data();
        printer.printWelcomeText();
        printer.printOptions(operations);
        double result;

        do {
            userInput.getUserChoice(data);
            if (data.getUserChoice() == 0) {
                break;
            }
            userInput.getOperands(data);
            result = operations[data.getUserChoice() - 1].executeCalculation(data.getFirstOperand(), data.getSecondOperand());
            printer.printDoubleResult(result);
        } while (true);
        printer.printGoodByeText();
    }
}


