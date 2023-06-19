// lv.2 JadenCase 문자열 만들기
package Test06.Test0619_P;

public class Ayoung {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {3,7,4,8};
        int[] arr3 = {10};

        // �׽�Ʈ ���̽��� ���ڿ��� �ٲ� ���
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }

    class Solution {
        public StringBuilder solution(String s) {
            String[] Arraystr = s.split(" "); // 문자열 분리
            StringBuilder answer = new StringBuilder();

            for (int i =0; i<Arraystr.length ; i++){
                String a = Arraystr[i];
                answer.append(upperFirstChar(a));
                if(i != Arraystr.length -1){
                    answer.append(" ");
                }
            }

            return answer;
        }

        public String upperFirstChar(String a){ // 분리된 문자열의 첫 글자를 대문자로 변경하는 함수
            String firstA = a.substring(0,1);
            String secondA = a.substring(1, a.length());
            String finalA;

            if(isAlpha(firstA)){
                finalA = firstA.toUpperCase() + secondA.toLowerCase();
            } else{
                finalA = firstA + secondA.toLowerCase();
            }
            return finalA;

        }

        public boolean isAlpha(String s){ // 문자열이 알파벳으로만 이루어져있는지 확인
            return s != null && s.chars().allMatch(Character::isLetter);
        }
    }

}
