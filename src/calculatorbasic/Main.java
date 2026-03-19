package calculatorbasic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

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






    }

}
