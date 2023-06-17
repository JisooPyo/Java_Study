// lv.2 JadenCase 문자열 만들기
package Test06.Test0619_P;

import java.util.ArrayList;

public class Jinhyuk {
    class Solution {
        public String solution(String s) {

            // asnwer 선언 및 초기화
            String answer = "";

            // 문자열을 띄어쓰기로 분리(공백문자 연속해서 나올 수 없음)
            String[] splitWord = s.split("\\s");

            // result 라는 arraylist 리스트 생성
            ArrayList<String> result = new ArrayList<>();

            // 글들을 나눔
            for (int i = 0; i < splitWord.length; i++) {
                // 첫번째 글자를 나눠서 firstWord
                String firstWord = splitWord[i].substring(0, 1);
                // 두번째 글자를 나눠서 restWord
                String restWord = splitWord[i].substring(1);

                // 첫 글자를 대문자로 변환
                firstWord = firstWord.toUpperCase();

                // 나머지를 소문자로 변환
                restWord = restWord.toLowerCase();

                // result 에 대소문자로 변환한 결과값을 합쳐서 담음
                result.add(firstWord + restWord);
            }
            // answer 에 result 리스트 속 값을 join 통해서 띄워쓰기로 구분해서 하나의 문자열로 만듬
            answer = String.join(" ", result);

            // 정답을 return
            return answer;

        }
    }
}