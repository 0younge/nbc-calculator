package v2;

import java.util.Scanner;

public class Calculator {

    // 속성
    private Scanner scanner;
    private Storage storage;
    String input;

    // 생성자
    Calculator(Scanner scanner, Storage storage) {
        this.scanner = scanner;
        this.storage = storage;
    }

    // 기능
    public void run(boolean start) {
        System.out.print("계산을 입력하세요: ");
        while (start) {
            input = scanner.nextLine();
            if (input.equals("=")) {
                for (int i = 0;i < storage.getSize();i++) {
                    System.out.println(storage.getList(i));
                }
            }
            storage.addList(input);
        }


    }


}
