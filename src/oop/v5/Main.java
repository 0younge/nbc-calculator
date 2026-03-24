package oop.v5;

import oop.v5.task.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // 필요 객체
        IOHandler ioHandler = new IOHandler();
        Repository repository = new Repository();

        // 작업 목록
        Map<String, Task> taskMap = new HashMap<>();
        InputGuide inputGuide = new InputGuide();
        InputStore inputStore = new InputStore(ioHandler, repository);
        ResultPrinter resultPrinter = new ResultPrinter(repository);
        taskMap.put("guide", inputGuide);
        taskMap.put("input", inputStore);
        taskMap.put("result", resultPrinter);

        // 계산기 설정
        Calculator calculator = new Calculator(taskMap);

        // 계산기 실행
        calculator.runCalculator();


    }

}
