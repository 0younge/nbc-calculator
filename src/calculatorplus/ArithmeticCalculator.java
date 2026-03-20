package calculatorplus;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number>{

    // 속성
    private ArrayList<Double> resultList = new ArrayList<>();

    // 생성자

    // 기능
    public double calculate(T num1, T num2, OperatorType operator) {
        double result = operator.calculate(num1.doubleValue (), num2.doubleValue());
        resultList.add(result);
        return result;
    }

    public void biggerresult(double num) {
        ArrayList<Double> arr  = (ArrayList<Double>) resultList.stream().filter((list -> list > num)).collect(Collectors.toList());
        System.out.println("입력값보다 큰 결과 값 입니다," + arr.toString());
    }

    public ArrayList<Double> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<Double> resultList) {
        this.resultList = resultList;
    }

    public void removeOldResultList() {
        resultList.remove(0);
    }

}
