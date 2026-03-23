package oop.v2;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    // 속성
    private List<String> inputList = new ArrayList<>();

    // 생성자

    // 기능
    public void addList(String input) {
        inputList.add(input);
    }

    public int getSize() {
        return inputList.size();
    }

    public String getList(int indexNum) {
        return inputList.get(indexNum);
    }

}
