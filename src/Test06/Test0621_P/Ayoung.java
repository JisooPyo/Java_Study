// lv.1 약수의 개수와 덧셈
package Test06.Test0621_P;

public class Ayoung {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0; // 정답
            for (int i = left; i <= right; i++){ // 왼쪽 ~ 오른쪽 값
                if(countDivisor(i) %2 == 0) { // 짝수면 덧셈
                    answer+= i;
                } else{ // 홀수면 뺄셈
                    answer -= i;
                }
            }
            System.out.println(answer);
            return answer;
        }

        // 약수의 갯수를 구하는 함수
        public int countDivisor (int input){
            int count = 0; // 약수의 갯수를 세는 변수
            for(int i=1; i <= input; i++){
                if(input % i == 0) count ++; // 약수가 있을 경우 count ++
            }
            System.out.print(count + ">>" ); // 결과 찍어보기
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution(14,17);
        solution.solution(1,27);
        solution.solution(35,45);

    }
}
