package oop.v5;

import java.util.Scanner;

public class IOHandler {

    // 속성
    private Scanner scanner = new Scanner(System.in);

    // 생성자

    // 기능
    public String ScanInput() {
        return scanner.nextLine();
    }

}
