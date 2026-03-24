# 계산기 프로젝트

Java로 구현한 콘솔 기반 계산기입니다. 단계별로 기능을 확장하며 구현했습니다.

---

## 1단계 - 기본 계산기 (`calculatorbasic`)

### 구현 기능

- **정수 입력 검증**: `Scanner`와 `InputMismatchException`을 활용하여 정수가 아닌 값 입력 시 재입력 요청
- **사칙연산 (+, -, *, /)**: `switch` 문으로 연산 처리
- **0으로 나누기 방지**: `/` 기호 입력 시 두 번째 수가 0이면 다른 기호 입력 유도
- **반복 계산**: `while` 루프로 계속 계산 가능하며, `exit` 입력 시 프로그램 종료

---

## 2단계 - 향상된 계산기 (`calculatorplus`)

### 구현 기능

#### App (메인)
- **실수(double) 입력 지원**: 정수 및 소수점 숫자 모두 처리
- **계산 결과 목록 출력**: 계산할 때마다 누적된 결과 리스트를 오래된 순으로 출력
- **오래된 결과 삭제**: `yes` 입력 시 가장 오래된 계산 결과를 목록에서 제거
- **반복 계산 및 종료**: `exit` 입력 시 종료

#### ArithmeticCalculator (제네릭 계산 클래스)
- **제네릭 타입 `<T extends Number>`** 적용으로 다양한 숫자 타입 지원
- **`calculate(T num1, T num2, OperatorType operator)`**: 연산 수행 후 결과를 내부 리스트에 저장
- **`biggerresult(double num)`**: 입력값보다 큰 기존 계산 결과를 스트림 필터로 추출하여 출력
- **`getResultList()` / `setResultList()`**: 결과 목록 getter/setter
- **`removeOldResultList()`**: 가장 오래된 결과(index 0) 삭제

#### OperatorType (열거형)
- **`enum`으로 연산자 관리**: `PLUS`, `MINUS`, `MULTIPLICATION`, `DIVISION` 정의
- **함수형 인터페이스 `Calculator`**: `@FunctionalInterface`로 선언, 람다식으로 각 연산 구현
- **`symbolType(String symbol)`**: 문자열 기호를 해당 `OperatorType`으로 변환

---

## 도전 과제

| 항목 | 내용 |
|------|------|
| 제네릭 클래스 | `ArithmeticCalculator<T extends Number>`로 숫자 타입 추상화 |
| 스트림 활용 | `resultList.stream().filter()`로 조건부 결과 필터링 |
| 함수형 인터페이스 | `@FunctionalInterface`와 람다식으로 연산 로직 캡슐화 |
| Enum 연산자 관리 | 연산 기호와 로직을 `OperatorType` enum에 통합 |

---

## v(N)폴더

객체지향 공부하면서 추가한 본 과제 외 시도들입니다
