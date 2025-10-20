package calculatorproject;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //        Lv 2.
    //        1. 계산된 결과 값들을 기록하는 컬렉션을 만든다.
    //        2. 컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능을 만든다.

        // 속성
        private int result;

        // 연산 결과 저장용 컬렉션
        private List<Integer> results = new ArrayList<>();

        // 기능

        // 계산하기
        public int calculate(int num1, int num2, char ch) {
            if(ch == '+') {
                result = num1 + num2;
            } else if(ch == '-') {
                result = num1 - num2;
            } else if(ch == '*') {
                result = num1 * num2;
            } else if (ch == '/') {
                if (num2 == 0) {
                    System.out.println("오류: 분모에 0이 들어갈 수 없습니다.");
                    return 0;
                } else {
                    result = num1 / num2;
                }
            }
            results.add(result); // 결과 저장하기
            return result;
        }

        // 전체 결과 가져오기
        public List<Integer> getResults() {
            return results;
        }

        // 결과 수정 기능
        public void setResults(List<Integer> results) {
            this.results = results;
        }

        // 먼저 저장된 결과 삭제 기능
        public Integer removeResult() {
            if (!results.isEmpty()) {
                return results.remove(0);
            } else {
                System.out.println("삭제할 결과가 없습니다.");
                return null;
            }
        }
}
