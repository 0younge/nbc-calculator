package v4;

public class Main {

    public static void main(String[] args) {

        InputManage inputManage = new InputManage();
        Repository repository = new Repository();
        Calculation calculation = new Calculation();
        Calculator calculator = new Calculator(inputManage, repository, calculation);

        calculator.runCalculator();

    }

}
