package calculatorplus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("=== 계산기 ===");

        // 1. 스캐너 생성
        Scanner sc = new Scanner(System.in);

        int firstNum; // 첫 번째 값
        int secondNum; // 두 번째 값
        String symbol; // 기호
        int result = 0; // 결과 값
        String keepCalculator; // 반복 계산 여부 확인
        boolean keep  = true; // 반복 계산 처리 값

        while (keep) {
            // 첫 번째 정수 입력
            while (true) {

                System.out.print("첫 번째 정수를 입력하세요: ");
                try {
                    firstNum = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("정수를 입력하세요.");
                    sc.nextLine();
                    continue;
                }

            }

            // 두 번째 정수 입력
            while (true) {

                System.out.print("두번째 정수를 입력하세요: ");
                try {
                    secondNum = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("정수를 입력하세요.");
                    sc.nextLine();
                    continue;
                }

            }

            // 사칙연산 기호 입력
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                symbol = sc.nextLine();

                if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*")) {
                    break;
                } else if (secondNum == 0 && symbol.equals("/")) {
                    System.out.println("0으로 나눌 수 없습니다 다른 기호를 입력하세요.");
                    continue;
                } else if (symbol.equals("/")) {
                    break;
                } else {
                    System.out.println("정해진 기호만 입력가능합니다 다시 입력하세요.");
                    continue;
                }
            }

            // 계산 부분
            switch (symbol) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = firstNum / secondNum;
                    break;
                default:
                    System.out.println("예상하지 못한 오류가 발생했습니다.");
            }

            // 출력 부분
            System.out.println("계산 결과는: " + result + "입니다.");

            // 반복 계산 여부 확인
            System.out.println("exit를 입력하시면 계산을 정지합니다 그 외 문자 입력시 계산이 다시 진행됩니다.");
            System.out.print("입력하세요: ");
            keepCalculator = sc.nextLine();
            if (keepCalculator.equals("exit")) {
                keep = false;
            }
        }

    }

}
