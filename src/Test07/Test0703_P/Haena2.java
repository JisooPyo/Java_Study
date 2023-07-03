package Test07.Test0703_P;

public class Haena2 {
	public static void main(String[] args) {
		SolutionHn2 sol = new SolutionHn2();
		System.out.println(sol.solution(45));
		System.out.println(sol.solution(125));
	}
}

class SolutionHn2 {
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();

		// 뒤집어진 3진수 구하기
		while(n != 0){
			sb.append(n % 3);
			n /= 3;
		}

		// parseInt를 활용하여 10진수 구하기
		return Integer.parseInt(sb.toString(),3);
	}
}

/*
테스트 1 〉	통과 (0.03ms, 73MB)
테스트 2 〉	통과 (0.05ms, 70.8MB)
테스트 3 〉	통과 (0.04ms, 66.5MB)
테스트 4 〉	통과 (0.05ms, 76.2MB)
테스트 5 〉	통과 (0.04ms, 71.6MB)
테스트 6 〉	통과 (0.05ms, 79.2MB)
테스트 7 〉	통과 (0.04ms, 72.2MB)
테스트 8 〉	통과 (0.05ms, 73.3MB)
테스트 9 〉	통과 (0.04ms, 76.7MB)
테스트 10 〉	통과 (0.06ms, 75.3MB)
 */
