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
    public TaskResult execute() {

        String input = ioHandler.scanInput();
        if (input.equals("=")) {
            return new TaskResult("result");
        }
        else if (input.equals("exit")) {
            return new TaskResult("exit");
        } else {
            repository.addList(input);
            return new TaskResult("input");
        }

    }
}
