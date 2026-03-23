package oop.v4;

public class ShowResult implements InOutTask {

    // 속성
    private Repository repository;

    // 생성자
    ShowResult(Repository repository) {
        this.repository = repository;
    }

    // 기능
    @Override
    public void inOutValue() {
        System.out.println("결과 기록: " + repository.getResultList());
        System.out.println("수식을 입력하세요(enter단위로 저장)");
        System.out.println("exit 입력시 계산기 종료");
        System.out.println("ex) 1 enter + enter 2 enter = enter");
        System.out.print("입력: ");

    }
}
