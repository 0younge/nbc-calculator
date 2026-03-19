package calculatorplus;

import java.util.ArrayList;

public class Calculator {

    // 속성
    ArrayList<Integer> resultList = new ArrayList<>();

    // 생성자

    // 기능
    public int calculate(int num1, int num2, String symbol) {
        int result = 0;
        switch (symbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        resultList.add(result);
        return result;
    }
}
