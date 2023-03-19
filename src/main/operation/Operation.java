package main.operation;

public interface Operation {
    public static final String NAME = "Név";

    String getName();

    public double executeCalculation(int firstOperand, int secondOperand);

    // A KOVETKEZOKET IS TARTALMAZHATJA INTERFACE: (de nem hasznaljuk a gyakorlatban)

//    public default String getName(){  // ha nem fut le mas a tobbi osztalyban akkor ez fog
//        printName();
//        getStaticName();
//        return NAME;
//    }

//    private void printName(){
//        System.out.println( NAME );
//    }
//
//    public static String getStaticName(){
//        return NAME;
//    }
}