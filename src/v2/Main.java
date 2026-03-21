package v2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        Calculator calculator = new Calculator(scanner, storage);

        String start;

        System.out.println("계산기를 실행 하겠습니까?");
        System.out.print("yes 입력시 실행, 다른 입력시 프로그램이 종료됩니다: ");
        start = scanner.nextLine();

        if (start.equals("yes")) {
            calculator.run(true);
        }



    }

}
