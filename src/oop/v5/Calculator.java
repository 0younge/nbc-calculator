package oop.v5;

import oop.v5.task.InputStore;
import oop.v5.task.ResultPrinter;

public class Calculator {

    // 속성
    private IOHandler ioHandler;
    private Repository repository;
    private InputStore inputStore;
    private ResultPrinter resultPrinter;

    // 생성자
    public Calculator(IOHandler ioHandler, Repository repository, InputStore inputStore, ResultPrinter resultPrinter) {
        this.ioHandler = ioHandler;
        this.repository = repository;
        this.inputStore = inputStore;
        this.resultPrinter =  resultPrinter;
    }

    // 기능
    public void runCalculator() {
        System.out.println("===== 계산기 =====");

        while (true) {
            inputStore.execute();

            resultPrinter.execute();
        }

    }

}
