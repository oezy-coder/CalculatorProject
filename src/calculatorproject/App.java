package calculatorproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Scanner로 입력 받기
        Scanner sc = new Scanner(System.in);

        // Calculator 객체 생성
        Calculator calculator = new Calculator();

        while (true) {
            // 정수형 입력 받기
            System.out.print("첫 번째 숫자 입력: ");
            String input1 = sc.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("두 번째 숫자 입력: ");
            String input2 = sc.nextLine();
            int num2 = Integer.parseInt(input2);

            // 사칙연산 기호 입력 받기
            System.out.print("사칙연산 기호 입력: ");
            char ch = sc.nextLine().charAt(0);

            // calculate() 호출해서 결과 얻기
            int result = calculator.calculate(num1, num2, ch);
            if (!(ch == '/' && num2 == 0)) {
                System.out.println("결과: " + result);
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String again = sc.nextLine();
            if (again.trim().equalsIgnoreCase("exit")) {
                break;
            }
        }

        // 계산기 종료 후 결과 확인
        System.out.println("지금까지의 계산 결과들: " + calculator.getResults());

        // setter로 결과 수정해보기
        calculator.setResults(new ArrayList<>(List.of(1, 2, 3)));
        System.out.println("수정된 결과 리스트: " + calculator.getResults());

        // 가장 먼저 저장된 데이터 삭제
        System.out.println("삭제된 데이터: " + calculator.removeResult());
    }




}
