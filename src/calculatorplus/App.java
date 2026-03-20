package calculatorplus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("=== 계산기 ===");

        // 스캐너 생성
        Scanner sc = new Scanner(System.in);

        // 계산 클래스 객체화
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        double firstNum; // 첫 번째 값
        double secondNum = 0; // 두 번째 값
        String symbol; // 기호
        double result = 0; // 결과 값
        String whether; // 여부 확인 값
        boolean keep  = true; // 반복 계산 여부 값
        String input = "0";


        while (keep) {
            // 첫 번째 정수 입력
            while (true) {

                System.out.print("첫 번째 숫자를 입력하세요: ");
                input = sc.nextLine();
                try {
                    if (input.contains(".")) {
                        firstNum = Double.parseDouble(input);
                    } else {
                        firstNum = Integer.parseInt(input);
                    }
                    arithmeticCalculator.biggerresult(Double.parseDouble(input));
                    break;
                } catch (RuntimeException e) {
                    System.out.println("숫자를 입력하세요.");
                }

            }

            // 두 번째 정수 입력
            while (true) {

                System.out.print("두번째 숫자를 입력하세요: ");
                input = sc.nextLine();
                try {
                    if (input.contains(".")) {
                        secondNum = Double.parseDouble(input);
                    } else {
                        secondNum = Integer.parseInt(input);
                    }
                    arithmeticCalculator.biggerresult(Double.parseDouble(input));
                    break;
                } catch (RuntimeException e) {
                    System.out.println("숫자를 입력하세요.");
                }


            }

            // 사칙연산 기호 입력
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                symbol = sc.nextLine();

                if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
                    break;
                } else {
                    System.out.println("정해진 기호만 입력가능합니다 다시 입력하세요.");
                }
            }

            // 계산 부분
            result = arithmeticCalculator.calculate(firstNum, secondNum, OperatorType.symbolType(symbol));

            // 출력 부분
            System.out.println("계산 결과는: " + result + "입니다.");

            // 게터 활용
            System.out.println("현재까지 계산 결과(오래된 순): " + arithmeticCalculator.getResultList());

            // 오래된 기록 지우기
            System.out.println("가장 오래된 계산 결과를 지우시겠습니까?");
            System.out.print("yes 입력시 가장 오래된 계산 결과 삭제/ 그 외 입력시 취소: ");
            whether = sc.nextLine();
            if (whether.equals("yes")) {
                arithmeticCalculator.removeOldResultList();
            }
            System.out.println("현재까지 계산 결과(오래된 순): " + arithmeticCalculator.getResultList());

            // 반복 계산 여부 확인
            System.out.println("exit를 입력하시면 계산을 정지합니다 그 외 문자 입력시 계산이 다시 진행됩니다.");
            System.out.print("입력하세요: ");
            whether = sc.nextLine();
            if (whether.equals("exit")) {
                keep = false;
            }


        }

    }

}
