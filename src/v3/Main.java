package v3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();
        Calculator calculator = new Calculator();
        Parser parser = new Parser();
        CalculatorController controller = new CalculatorController(scanner, repository, calculator, parser);

        controller.runProgram();



    }

}
