package main;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public void getUserChoice(Data data) {
        System.out.print("Melyik muvelet?: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        data.setUserChoice(choice);

    }

    public void getOperands(Data data) {
        System.out.print("Az elso operandus: ");
        int firstOperand = scanner.nextInt();
        scanner.nextLine();
        System.out.print("A masodik operandus: ");
        int secondOperand = scanner.nextInt();
        scanner.nextLine();
        data.setFirstOperand(firstOperand);
        data.setSecondOperand(secondOperand);

    }

}
