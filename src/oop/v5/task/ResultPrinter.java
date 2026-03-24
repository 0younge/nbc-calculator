package oop.v5.task;

import oop.v5.Repository;

public class ResultPrinter implements Task{

    // 속성
    private Repository repository;

    // 생성자
    public ResultPrinter(Repository repository) {
        this.repository = repository;
    }

    // 기능
    @Override
    public TaskResult execute() {
        // 계산 기능 들어올 부분
        System.out.println("결과 목록: " + repository.getList());
        return new TaskResult("guide");

    }
}
