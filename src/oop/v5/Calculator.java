package oop.v5;

import oop.v5.task.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    // 속성
    private Map<String, Task> taskMap;
    private TaskResult taskResult = new TaskResult(TaskCommandType.GUIDE.getTaskResult());;

    // 생성자
    public Calculator(Map<String, Task> taskMap) {
        this.taskMap = taskMap;
    }

    // 기능
    public void runCalculator() {
        System.out.println("===== 계산기 =====");

        while (true) {

            taskResult = taskMap.get(taskResult.getCommand()).execute();

            if (taskResult.getCommand().equals("exit")) {
                break;
            }

        }

    }

}
