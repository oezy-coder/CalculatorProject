package calculatorproject;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

//        Lv 1.
//        1. 계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
//        2. 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

        // 1. 객체화 하기
        Scanner sc = new Scanner(System.in);

        // 2. 정수형 입력 받기
        System.out.print("첫 번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = sc.nextInt();

        // 3. 사칙연산 기호 입력 받기
        System.out.print("사칙연산 기호 입력: ");
        char ch = sc.next().charAt(0);

        // 4. 정수와 기호를 이용하여 연산 후 결과값 출력하기
        int result = 0;

        if (ch == '+') {
            result = num1 + num2;
            System.out.println("결과: " + result);
        } else if (ch == '-') {
            result = num1 - num2;
            System.out.println("결과: " + result);
        } else if (ch == '*') {
            result = num1 * num2;
            System.out.println("결과: " + result);
        } else if (ch == '/') {
            num2 = 0;
            System.out.println("오류: 분모에 0이 입력될 수 없습니다.");
            result = num1 / num2;
            System.out.println("결과: " + result);
        }
    }
}
