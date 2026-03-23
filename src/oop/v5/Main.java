package oop.v5;

import oop.v5.task.InputStore;
import oop.v5.task.ResultPrinter;

public class Main {

    public static void main(String[] args) {

        // 필요 객체
        IOHandler ioHandler = new IOHandler();
        Repository repository = new Repository();
        InputStore inputStore = new InputStore(ioHandler, repository);
        ResultPrinter resultPrinter = new ResultPrinter(repository);

        Calculator calculator = new Calculator(ioHandler, repository, inputStore, resultPrinter);

        // 계산기 실행
        calculator.runCalculator();


    }

}
