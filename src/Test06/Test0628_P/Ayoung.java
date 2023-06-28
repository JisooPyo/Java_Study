// lv.1 시저 암호
package Test06.Test0628_P;

import java.util.Arrays;

public class Ayoung {
    public StringBuilder solution(String s, int n) {
        char [] charArray = s.toCharArray(); // String을 char 배열로 변경
        StringBuilder answer = new StringBuilder();

        for (char c : charArray){
            int ascii = (int) c;
            if(c != ' '){ // 공백이 아닐 때만 밀기
                ascii += n;
            }

            if(c <= 90 && ascii > 90 || // 대문자이면서 밀면 범위 벗어남
                    c >=97 && c <= 122 && ascii > 122){ // 소문자이면서 밀면 범위 벗어남
                ascii -= 26; // 초기값으로
            }
            answer.append((char)ascii); // 연산한 값을 부착
        }
        return answer;
    }

    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution("AB",1));
        System.out.println(ay.solution("z",1));
        System.out.println(ay.solution("A f Z",3));
    }
}
