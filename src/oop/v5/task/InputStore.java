package oop.v5.task;

import oop.v5.IOHandler;
import oop.v5.Repository;

public class InputStore implements Task{

    // 속성
    private IOHandler ioHandler;
    private Repository repository;

    // 생성자
    public InputStore(IOHandler ioHandler, Repository repository) {
        this.ioHandler = ioHandler;
        this.repository = repository;
    }

    // 기능
    @Override
    public void execute() {
        System.out.println("계산할 수식을 입력하세요");
        System.out.println("ex) 1 enter + enter + 3 enter = enter");
        System.out.print("입력: ");

        while (true) {
            String input = ioHandler.ScanInput();
            repository.addList(input);
            if (input.equals("=")) {
                break;
            }
        }

    }
}
