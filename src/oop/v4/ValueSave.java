package oop.v4;

public class ValueSave implements InOutTask {

    // 속성
    private Repository repository;
    private String input;

    // 생성자
    ValueSave(Repository repository, String input) {
        this.repository = repository;
        this.input = input;
    }

    // 기능
    @Override
    public void inOutValue() {
        repository.addInputList(input);
    }
}
