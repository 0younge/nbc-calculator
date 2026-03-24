package oop.v5.task;

public enum TaskCommandType {
    GUIDE("guide"),
    INPUT("input"),
    RESULT("result"),
    EXIT("exit");

    private final String taskResult;

    TaskCommandType(String taskResult) {
        this.taskResult = taskResult;
    }

    public String getTaskResult() {
        return taskResult;
    }
}

