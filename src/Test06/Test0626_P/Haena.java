// lv. 1 최대공약수와 최소공배수
package Test06.Test0626_P;

import java.util.Arrays;

public class Haena {
    public static void main(String[] args) {
        SolutionHn sol = new SolutionHn();
        System.out.println(Arrays.toString(sol.solution(3, 12)));
        System.out.println(Arrays.toString(sol.solution(2, 5)));
        System.out.println(Arrays.toString(sol.solution(4, 20)));
        System.out.println(Arrays.toString(sol.solution(3, 7)));
    }

}

class SolutionHn {
    public int[] solution(int n, int m) {
        // 최대공약수 구하기
        int g = 0;
        int min = Math.min(n, m);
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                g = i;
                break;
            }
        }

        // 최소공배수 구하기
        int l = 0;
        int max = Math.max(n, m);
        for (int i = max; i <= n * m; i++) {
            if (i % n == 0 && i % m == 0) {
                l = i;
                break;
            }
        }

        return new int[] {g, l};
    }
}

/*
테스트 1 〉	통과 (0.03ms, 71.7MB)
테스트 2 〉	통과 (0.04ms, 73MB)
테스트 3 〉	통과 (0.05ms, 74.5MB)
테스트 4 〉	통과 (0.05ms, 78.2MB)
테스트 5 〉	통과 (0.04ms, 72.4MB)
테스트 6 〉	통과 (0.04ms, 78.1MB)
테스트 7 〉	통과 (0.03ms, 63.7MB)
테스트 8 〉	통과 (0.03ms, 69.7MB)
테스트 9 〉	통과 (0.09ms, 74.9MB)
테스트 10 〉	통과 (0.05ms, 76.4MB)
테스트 11 〉	통과 (4.48ms, 76.7MB)
테스트 12 〉	통과 (8.10ms, 77.6MB)
테스트 13 〉	통과 (4.22ms, 73MB)
테스트 14 〉	통과 (7.77ms, 67.3MB)
테스트 15 〉	통과 (0.23ms, 77MB)
테스트 16 〉	통과 (4.21ms, 78.6MB)
 */
