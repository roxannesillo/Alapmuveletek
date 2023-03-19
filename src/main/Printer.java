package main;

import main.operation.Operation;

import java.text.DecimalFormat;

public class Printer {


    public void printWelcomeText() {
        System.out.println("\nÜdvözöllek az Alapműveletek programban!");
    }

    public void printOptions(Operation[] operations) {
        System.out.println("0. Kilepes");
        int count = 1;
        for (Operation operation : operations) {
            System.out.println(count++ + ". " + operation.getName());
        }
    }



    public void printDoubleResult(double result) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("az eredmény: " + df.format(result));

    }

    public void printGoodByeText() {
        System.out.println("Viszlát!");
    }
}
