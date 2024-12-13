package ch06.exercise2;

// 문제 설명: 간단한 콘솔 기반의 계산기 프로그램을 작성하십시오. 
//	          사용자는 두 개의 숫자를 입력하고 기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈)을 수행할 수 있어야 합니다. 
//	          프로그램은 다음과 같은 요구 사항을 충족해야 합니다.
// 요구 사항:
//   1. 프로그램은 사용자가 숫자 두 개와 연산자를 입력할 수 있도록 안내해야 합니다.
//   2. 지원해야 할 연산자는 다음과 같습니다:
//	     - 덧셈 (+)
//	     - 뺄셈 (-)
//	     - 곱셈 (*)
//	     - 나눗셈 (/)
//   3. 연산 결과를 출력한 후, 사용자가 프로그램을 종료하거나 새로운 계산을 할 수 있도록 해야 합니다.
//   4. 나눗셈에서 두 번째 숫자가 0일 경우, 적절한 오류 메시지를 출력하고 다시 입력을 받도록 해야 합니다.
//   5. 연산 결과가 소수점으로 나누어질 경우, 소수점 이하 두 자리까지 출력하도록 하십시오.
//  
//   예시 실행 결과:
// === 콘솔 계산기 ======================================================
// 첫 번째 숫자를 입력하세요: 10
// 연산자를 입력하세요 (+, -, *, /): *
// 두 번째 숫자를 입력하세요: 5
// 결과: 10 * 5 = 50
//
// 계산을 계속하시겠습니까? (y/n): y
//
// 첫 번째 숫자를 입력하세요: 12
// 연산자를 입력하세요 (+, -, *, /): /
// 두 번째 숫자를 입력하세요: 0
// 오류: 0으로 나눌 수 없습니다. 다시 입력하세요.
// 두 번째 숫자를 입력하세요: 4
// 결과: 12 / 4 = 3.00
//
// 계산을 계속하시겠습니까? (y/n): n
// 프로그램을 종료합니다.
// ====================================================================
import java.util.Scanner;

public class CalculatorApplication {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        System.out.println("=== 콘솔 계산기 ===");
        
        while (keepGoing) {
            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();

            // 연산자 입력
            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // 두 번째 숫자 입력
            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = performOperation(num1, num2, operator);

            if (validOperation) {
                result = getOperationResult(num1, num2, operator);
                System.out.printf("결과: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
            }
        }

        // 계산을 계속할지 여부 확인
        System.out.print("계산을 계속하시겠습니까? (y/n): ");
        char response = scanner.next().charAt(0);
        if (response == 'n' || response == 'N') {
            keepGoing = false;
            System.out.println("프로그램을 종료합니다.");
        }
    }

    public static boolean performOperation(double num1, double num2, char operator) {
        if (operator == '/' && num2 == 0) {
            System.out.println("오류: 0으로 나눌 수 없습니다. 다시 입력하세요.");
            return false;
        }
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("오류: 잘못된 연산자입니다. 다시 입력하세요.");
            return false;
        }
        return true;
    }

    public static double getOperationResult(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }
}



