package v3;

import java.util.Scanner;

public class CalculatorController {

    // 속성
    private Scanner scanner;
    private Repository repository;
    private Calculator calculator;
    private Parser parser;

    // 생성자
    public CalculatorController(Scanner scanner, Repository repository, Calculator calculator, Parser parser) {
        this.scanner = scanner;
        this.repository = repository;
        this.calculator = calculator;
        this.parser = parser;
    }

    // 기능
    public void runProgram() {
        String runWhether;
        boolean power = false;
        System.out.println("===== 계산기 프로그램 =====");
        System.out.println("계산을 시작하려면 run을 입력하세요");
        System.out.print("그 외 값이 입력되면 프로그램이 종료됩니다:");
        runWhether = scanner.nextLine();

        if (runWhether.equals("run")) {
            power = true;

            System.out.println("숫자와 기호를 순서대로 입력하세요");
            System.out.println("예시: 5 enter + enter 10 enter = enter");
            System.out.print("입력: ");

        }

        while (power) {
            String input;
            input = scanner.nextLine();

            if (input.equals("=")) {
                double num1 = parser.changeType(repository.getList(0));
                double num2 = parser.changeType(repository.getList(2));

                double result = calculator.calculate(num1, repository.getList(1), num2);

                System.out.println(num1 + " " + repository.getList(1) + " " + num2 + " = " + result);

                System.out.print("계속 계산하시겠습니까?(yes,다른 입력시 종료):");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    repository.clearList();
                    System.out.println("숫자와 기호를 순서대로 입력하세요");
                    System.out.println("예시: 5 enter + enter 10 enter = enter");
                    System.out.print("입력: ");
                    continue;
                } else {
                    break;
                }

            }

            repository.addList(input);

        }



    }

}
