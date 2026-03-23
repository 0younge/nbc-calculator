package v4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repository {

    // 속성
    private List<String> inputList = new ArrayList<>();
    private List<String> resultList = new ArrayList<>();

    // 생성자

    // 기능
    public void addInputList(String input) {
        inputList.add(input);
    }

    public String getInputList(int num) {
        return inputList.get(num);
    }

    public int sizeInputList() {
        return inputList.size();
    }

    public List<String> getResultList() {
        return Collections.unmodifiableList(resultList);
    }

}
