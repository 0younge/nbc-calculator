package oop.v4;

public class Calculator {

    // 속성
    private InputManage inputManage;
    private Repository repository;
    private Calculation calculation;

    // 생성자
    public Calculator(InputManage inputmanage, Repository repository, Calculation calculation) {
        this.inputManage = inputmanage;
        this.repository = repository;
        this.calculation = calculation;
    }

    // 기능
    public void runCalculator() {
        System.out.println("===== 계산기 =====");
        System.out.println("수식을 입력하세요(enter단위로 저장)");
        System.out.println("exit 입력시 계산기 종료");
        System.out.println("ex) 1 enter + enter 2 enter = enter");
        System.out.print("입력: ");

        while (true) {
            InOutTask task;

            String input = inputManage.input();

            if (input.equals("=")) {
                task = new ShowResult(repository);
            } else if (input.equals("exit")) {
                break;
            } else {
                task = new ValueSave(repository, input);
            }

            task.inOutValue();


        }

    }

}
