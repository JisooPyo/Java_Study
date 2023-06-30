// lv.1 같은 숫자는 싫어
package Test06.Test0630_P;

import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        //예시 배열
        int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
        int[] arr2 = { 4,4,4,3,3 };

        //예시 출력
        System.out.println(jinhyuk.solution(arr1));
        System.out.println(jinhyuk.solution(arr2));
    }

    public int[] solution(int[] arr) {

        int equal = 0; // count를 선언 초기화

        for (int i = 0; i < arr.length - 1; i++) { //반복문으로 arr배열의 길이만큼 반복한다.
            if (arr[i] == arr[i + 1]) { //arr배열 속 같이 다음 숫자와 같은지 비교하고 같다면
                equal++; // equal을 한개 증가시킨다
            }
        }
        // 같은 수는 제거할 계획이므로 결과에 해당하는 배열은 equal만치 그 크기가 작다.
        int[] result = new int[arr.length - equal];

        int index = 0; //index 하나 쓸거라서 생성 초기화하고

        for (int i = 0; i < arr.length - 1; i++) { //for반복문을 arr배열의 크기만큼 돌리면서
            if (arr[i] != arr[i + 1]) { // arr의 숫자가 연속하지 않을때
                result[index++] = arr[i]; // 결과의 배열에 arr[i]를 추가하고 index를 하나 늘려준다
            }
        }
        result[index] = arr[arr.length - 1]; //틀린 부분!
        // 입력 배열의 마지막 숫자를 결과 배열에 추가하는 부분!
        return result; //결과 배열을 반환
    }
}
