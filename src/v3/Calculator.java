package v3;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    // 속성
    private Map<String, Operation> operationMap = new HashMap<>();

    // 생성자
    public Calculator() {
        operationMap.put("+", new Plus());
        operationMap.put("-", new Minus());
        operationMap.put("*", new Multiply());
        operationMap.put("/", new Divide());
    }

    // 기능
    public double calculate(double num1, String operation, double num2) {
        Operation operate = operationMap.get(operation);
        return operate.calculate(num1, num2);
    }

}
