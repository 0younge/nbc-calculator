package calculatorplus;

import java.util.ArrayList;

public class Calculator {

    // 속성
    ArrayList<Integer> resultList = new ArrayList<>();

    // 생성자

    // 기능
    public int calculate(int num1, int num2, String symbol) {
        int result;
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
                if (num2 == 0) {
                    throw new RuntimeException();
                } else result = num1 / num2;
                break;
            default:
                throw new RuntimeException();
        }
        resultList.add(result);
        return result;
    }
}
