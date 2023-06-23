// lv.1 공원 산책
package Test06.Test0623_P;
public class Jinhyuk {


    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

//        System.out.println(Jinhyuk.solution());

    }

    public int[] solution(String[] park, String[] routes) {

        int[] answer = new int[2]; //배열의 선언 초기화
        //answer[0], answer[1]에 좌표들 넣을 예정
//        int[][] array;
        int x = 0; // 가로 좌표 X
        int y = 0; // 세로 좌표 X
        int H = park.length; //공원의 세로 길이 H
        int W = park[0].length(); //공원의 가로길이 W *구글링
//        array = new int[8][9];

        char[][] parkArray = new char[H][W]; //이차원 배열 생성 길이알려주고 초기화

        for (int i = 0; i < H; i++) { //for i문으로 세로 위치
            parkArray[i] = park[i].toCharArray(); //이차원배열에 정보저장, toCharArray는 문자를 배열로 변화후 이차원 배열에 저장 *구글링
            for (int j = 0; j < W; j++) { //for j문으로 가로 위치
                if (parkArray[i][j] == 'S') { //시작위치를 S로 Char이기 때문에 한글자로만
                    x = i; //가로 값 저장하고
                    y = j; //세로 값 저장!
                }
            }
        }
//        for (int i = 0; i <8; i++) {
//            for (int j = 0; j <9; j++) {
//                array[i][j]=
//            }
//        }
//        int[][] start = new int[8][9];
        boolean flag = true;
        switch (flag) {
            case 'e' :
            case 's' :
            case 'w' : 
            case 'n' :
        }


        for (String route : routes) { // 이동하는 방향과 거리를 알려주는 문장을 분리해서
            String[] Rt = route.split(" "); // 명령을 분리해서 0은 방향 1은 거리
            char Direction = Rt[0].charAt(0);
            int Distance = //....


            answer[0] = x;
            answer[1] = y;

            return answer;
        }
    }
}
