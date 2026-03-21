package v2;

import java.util.Scanner;

public class InputOutputManage {

    // 속성
    private Scanner scanner;
    private Storage storage;

    // 생성자
    InputOutputManage(Scanner scanner, Storage storage) {
        this.scanner = scanner;
        this.storage = storage;
    }

    // 기능
    public void startCalculator() {

        boolean start;
        String input;

        System.out.println("===== 계산기 프로그램 =====");
        System.out.print("run 입력시 실행, 다른 입력시 프로그램이 종료됩니다: ");

        input = scanner.nextLine();

        if (input.equals("run")) {
            start = true;
            System.out.print("계산을 입력하세요(enter단위로 저장, exit입력시 계산 입력 종료):");
        } else {
            start = false;
        }

        while (start) {

            input = scanner.nextLine();
            storage.addList(input);

            if (input.equals("=")) {
                for (int i = 0;i < storage.getSize();i++) {
                    System.out.println(storage.getList(i));
                }
            } else if (input.equals("exit")) {
                break;
            }


        }


    }

}
