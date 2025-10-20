package calculatorproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner로 입력 받기
        Scanner sc = new Scanner(System.in);

        // 정수형 입력 받기
        // while 문을 이용하여 무한으로 계산되도록 하기
        while (true) {
            System.out.print("첫 번째 숫자 입력: ");
            String input1 = sc.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("두 번째 숫자 입력: ");
            String input2 = sc.nextLine();
            int num2 = Integer.parseInt(input2);

            // 사칙연산 기호 입력 받기
            System.out.print("사칙연산 기호 입력: ");
            char ch = sc.nextLine().charAt(0);

            // 정수와 기호를 이용하여 연산 후 결과값 출력하기
            int result;
            if (ch == '+') {
                result = num1 + num2;
                System.out.println("결과: " + result);
            }
            if (ch == '-') {
                result = num1 - num2;
                System.out.println("결과: " + result);
            }
            if (ch == '*') {
                result = num1 * num2;
                System.out.println("결과: " + result);
            }
            if (ch == '/') {
                if (num2 == 0) {
                    System.out.println("오류: 분모에 0이 들어갈 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                }
            }

            // 계산이 계속되거나 종료할 수 있도록 만들기
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String again = sc.nextLine();
            if (again.trim().equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
