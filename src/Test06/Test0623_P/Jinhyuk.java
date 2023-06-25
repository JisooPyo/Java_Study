// lv.1 공원 산책
package Test06.Test0623_P;
<<<<<<< HEAD
<<<<<<< HEAD

import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();  //Jinhyuk클래스 안에 있는 solution을 사용하려고 적음
        // 코드내에서 결과를 확인할수 있는 main
        String[] park1 = { // 1번 공원의 형태
                "SOO",
                "OOO",
                "OOO"
        };
        String[] routes1 = {"E 2", "S 2", "W 1"}; // 1번 명령

        String[] park2 = { // 2번 공원의 형태
                "SOO",
                "OXX",
                "OOO"
        };
        String[] routes2 = {"E 2", "S 2", "W 1"}; // 2번 명령

        String[] park3 = { // 3번 공원의 형태
                "OSO",
                "OOO",
                "OXO",
                "OOO"
        };
        String[] routes3 = {"E 2", "S 3", "W 1"}; // 3번 명령

        // 출력하기
        // Arrays.toString는 각 배열의 내용을 문자열로 변경하고
        // 쉼표와 공백으로 구분해서 반환함
        // 배열안에 {1, 2, 3}가 있다면 "[1, 2, 3]"
        System.out.println(Arrays.toString(jinhyuk.solution(park1, routes1)));
        // 1번 문제 답 확인
        System.out.println(Arrays.toString(jinhyuk.solution(park2, routes2)));
        // 2번 문제 답 확인
        System.out.println(Arrays.toString(jinhyuk.solution(park3, routes3)));
        // 3번 문제 답 확인

        //올바른 답안 순서대로 [2, 1] [0, 1] [0, 0]
    }
    // solution(공원형태 지정, 이동 명령)
    public int[] solution(String[] park, String[] routes) {

        int H = park.length; //공원의 세로길이
        int W = park[0].length(); //공원의 가로길이
        int x = 0; //로봇강아지의 가로 위치
        int y = 0; //로봇강아지의 세로 위치

        //강아지의 시작 위치 설정
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    //공원 전체 위치에 대해서i,j를 반복하면서 S인 부분을 찾고
                    // S 를 발견했다면
                    x = j;  //j값을 강아지 위치인 x로
                    y = i;  //i값을 강아지 위치인 y로 지정한다.
                    break;  //그리고 나가!
                }
            }
        }
        //이동 명령 수행
        for (String s : routes) { //routes의 배열의 요소에 대해 반복
            // 반복하며 현재 요소의 값을 s라는 변수로 가져옴
            char direction = s.charAt(0);
            // 방향을 나타낼 direction에 s의 첫번째문자인 w,s,n,e등을 가져온다.
            int distance = Character.getNumericValue(s.charAt(2)); //거리
            // 거리를 나타낼 distance에 세번째 문자를 가져와서(띄어쓰기가 2번째 문자)
            // getNumericValue를 통해서 문자가 숫자인 경우 int값으로 변환해서 반환함
            // Tip. 주어진 문자가 숫자가 아닌 경우 -1을 반환함
            switch (direction) { //방향에 따른 이동을 구분하여 적는다.
                case 'E': //방향이 E 일 경우
                    if (x + distance < W) {
                        //멍뭉이의 현재 위치에 거리명령를 더한 값이 공원을 넘는지 확인
                        for (int i = 1; i <= distance; i++) {
                            // i를 거리만큼 하나씩 증가시키면서
                            x++; //멍멍이의 위치 좌표도 증가시킨다.
                            if (park[y].charAt(x) == 'X') {
                                // 만약 장애물은 x를 만난다면
                                x -= i; //x 좌표를 다시 왔던 i만큼 감소시키고
                                break; //for반복문을 종료시킨다. = 즉 위치변화없음
                            }
                        }
                    }
                    break; //원하는 방향의 동작만 실행하도록 하는 break;
                case 'W': //방향이 W 일 경우
                    if (x - distance >= 0) { //나머지 e와 같은 형식
                        for (int i = 1; i <= distance; i++) {
                            x--;
                            if (park[y].charAt(x) == 'X') {
                                x += i;
                                break;
                            }
                        }
                    }
                    break;
                case 'N': //방향이 N 일 경우
                    if (y - distance >= 0) {
                        for (int i = 1; i <= distance; i++) {
                            y--;
                            if (park[y].charAt(x) == 'X') {
                                y += i;
                                break;
                            }
                        }
                    }
                    break;
                case 'S': //방향이 S 일 경우
                    if (y + distance < H) {
                        for (int i = 1; i <= distance; i++) {
                            y++;
                            if (park[y].charAt(x) == 'X') {
                                y -= i;
                                break;
                            }
                        }
                    }
                    break;
            }
        }
        int[] answer = {y, x}; //결과값이 세로, 가로의 형태로 요구되서 y,x로 써준다.
        return answer; // 결과를 출력하낟.
=======
public class Jinhyuk {
=======
public class Jinhyuk {
>>>>>>> db30066 (Jinhyuk_P_공원산책)


    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

//        System.out.println(Jinhyuk.solution());

    }

    public int[] solution(String[] park, String[] routes) {

        int[] answer = new int[2]; //배열의 선언 초기화
        //answer[0], answer[1]에 좌표들 넣을 예정
//        int[][] array;
<<<<<<< HEAD
        int x = 0; // 가로 좌표 X
        int y = 0; // 세로 좌표 X
=======
        int x = 0; // 세로좌표 X
        int y = 0; // 가로 좌표 X
>>>>>>> db30066 (Jinhyuk_P_공원산책)
        int H = park.length; //공원의 세로 길이 H
        int W = park[0].length(); //공원의 가로길이 W *구글링
//        array = new int[8][9];

        char[][] parkArray = new char[H][W]; //이차원 배열 생성 길이알려주고 초기화

        for (int i = 0; i < H; i++) { //for i문으로 세로 위치
            parkArray[i] = park[i].toCharArray(); //이차원배열에 정보저장, toCharArray는 문자를 배열로 변화후 이차원 배열에 저장 *구글링
            for (int j = 0; j < W; j++) { //for j문으로 가로 위치
                if (parkArray[i][j] == 'S') { //시작위치를 S로 Char이기 때문에 한글자로만
<<<<<<< HEAD
                    x = i; //가로 값 저장하고
                    y = j; //세로 값 저장!
=======
                    x = i; //세로 값 저장하고
                    y = j; //가로 값 저장!
>>>>>>> db30066 (Jinhyuk_P_공원산책)
                }
            }
        }
//        for (int i = 0; i <8; i++) {
//            for (int j = 0; j <9; j++) {
//                array[i][j]=
//            }
//        }
//        int[][] start = new int[8][9];
<<<<<<< HEAD
        boolean flag = true;
        switch (flag) {
            case 'e' :
            case 's' :
            case 'w' : 
            case 'n' :
        }

=======
>>>>>>> db30066 (Jinhyuk_P_공원산책)

        for (String route : routes) { // 이동하는 방향과 거리를 알려주는 문장을 분리해서
            String[] Rt = route.split(" "); // 명령을 분리해서 0은 방향 1은 거리
            char Direction = Rt[0].charAt(0);
            int Distance = //....


            answer[0] = x;
            answer[1] = y;

            return answer;
        }
<<<<<<< HEAD
>>>>>>> dee0219327012a1a74a1acf400c2ce4ccf2f7893
=======
>>>>>>> db30066 (Jinhyuk_P_공원산책)
    }
}

/*
테스트 1 〉	통과 (0.04ms, 72.9MB)
테스트 2 〉	통과 (0.05ms, 80.3MB)
테스트 3 〉	통과 (0.05ms, 70.8MB)
테스트 4 〉	통과 (0.12ms, 74MB)
테스트 5 〉	통과 (0.12ms, 72.3MB)
테스트 6 〉	통과 (0.21ms, 80.8MB)
테스트 7 〉	통과 (0.14ms, 75.2MB)
테스트 8 〉	통과 (0.13ms, 77.7MB)
테스트 9 〉	통과 (0.14ms, 72.7MB)
테스트 10 〉	통과 (0.14ms, 75.6MB)
테스트 11 〉	통과 (0.20ms, 75.5MB)
테스트 12 〉	통과 (0.22ms, 81.2MB)
테스트 13 〉	통과 (0.15ms, 70.5MB)
테스트 14 〉	통과 (0.21ms, 74.1MB)
테스트 15 〉	통과 (0.14ms, 74.3MB)
테스트 16 〉	통과 (0.06ms, 66.3MB)
테스트 17 〉	통과 (0.12ms, 77.2MB)
테스트 18 〉	통과 (0.05ms, 83.5MB)
테스트 19 〉	통과 (0.20ms, 71.1MB)
테스트 20 〉	통과 (0.06ms, 76.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/