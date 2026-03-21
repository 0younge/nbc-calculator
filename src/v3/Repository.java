package v3;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    // 속성
    private List<String> inputList = new ArrayList<>();

    // 생성자

    // 기능
    public void addList(String input) {
        inputList.add(input);
    }

    public String getList(int index) {
        return inputList.get(index);
    }

    public int getSize() {
        return inputList.size();
    }


}
