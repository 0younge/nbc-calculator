package calculatorplus;

import java.util.function.Supplier;

public enum OperatorType {
    PLUS("+", (num1, num2) -> (num1 + num2)),
    MINUS("-", (num1, num2) -> (num1 - num2)),
    MULTIPLICATION("*", (num1, num2) -> (num1 * num2)),
    DIVISION("/", (num1, num2) -> (num1 /num2));

    private final String symbol;
    private final Calculator calculate;

    OperatorType(String symbol, Calculator calculate) {
        this.symbol = symbol;
        this.calculate = calculate;
    }

    @FunctionalInterface
    interface Calculator {
        double calculate(double num1, double num2);
    }

}
