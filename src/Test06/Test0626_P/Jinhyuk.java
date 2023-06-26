// lv. 1 최대공약수와 최소공배수
package Test06.Test0626_P;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();
        int n1 = 3;
        int m1 = 12;

        int n2 = 2;
        int m2 = 5;

        System.out.println(jinhyuk.solution(n1, m1));
        System.out.println(jinhyuk.solution(n2, m2));
    }

    public int[] solution(int n, int m) {
        int 최소공배수 = 0;
        int 최대공약수 = 0;

        for (int i = 1; i <= m && i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                최대공약수 = i;
            }
        }
        최소공배수 = (m*n)/최대공약수;

        int[] answer = {최대공약수, 최소공배수};
        return answer;
    }
}
