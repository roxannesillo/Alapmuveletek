package main.operation;

public class OperationFactory {

    private static Operation[] operations;

    public static Operation[] getOperations() {
        if (operations == null) { // Lazy inicializacio, csak akkor inicializalodik ha meghivjak a getOperationt
            operations = new Operation[]{new Addition(), new Subtraction(),
                    new Multiplication(), new Division(), new Percengate()};
        }
        return operations;
    }
}
