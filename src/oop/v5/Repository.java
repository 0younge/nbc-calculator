package oop.v5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repository {

    // 속성
    private List<String> inputList = new ArrayList<>();
    private List<Double> resultList = new ArrayList<>();

    // 생성자

    // 기능
    public void addList(String input) {
        inputList.add(input);
    }

    public List<Double> getList() {
        return Collections.unmodifiableList(resultList);
    }

}
