package oop.v5.task;

public class InputGuide implements Task{
    @Override
    public TaskResult execute() {
        System.out.println("계산할 수식을 입력하세요");
        System.out.println("ex) 1 enter + enter + 3 enter = enter");
        System.out.println("exit 입력시 종료");
        System.out.print("입력: ");
        return new TaskResult(TaskCommandType.INPUT.getTaskResult());
    }
}
