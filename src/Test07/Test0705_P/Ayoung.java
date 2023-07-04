package Test07.Test0705_P;
//프로그래머스 lv.1 이상한 문자 만들기(74%)
public class Ayoung {
    public static void main(String[] args) {
        Ayoung a = new Ayoung();
        System.out.println(solution("Try hello world"));
        System.out.println(solution("Try       HELLO   world"));
        System.out.println(solution("TRY HELLO  "));
    }

    public String solution(String s) {
        StringBuilder input = new StringBuilder(s); // StringBuilder의 함수를 사용하기 위해 변경

        boolean evenNum = true; // 짝수 번째 인덱스일 때 true

        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == ' '){ // 공백일 경우 짝수 인덱스로 세팅하고 더 이상 검사 X
                evenNum = true;
                continue;
            }

            if(evenNum){ // 짝수 번째 인덱스
                input.setCharAt(i,Character.toUpperCase(input.charAt(i))); // 해당 char 대문자로 변경
                evenNum = false; // 플래그 세팅
            }else{ // 홀수 번째 인덱스
                input.setCharAt(i,Character.toLowerCase(input.charAt(i))); // 해당 char 소문자로 변경
                evenNum = true; // 플래그 세팅
            }
        }
        return input.toString(); // String으로 변경해서 리턴
    }
}
