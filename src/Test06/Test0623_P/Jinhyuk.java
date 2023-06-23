// lv.1 공원 산책
package Test06.Test0623_P;

import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        String[] t1_1 = {
                "SOO",
                "OOO",
                "OOO"
        };
        String[] t1_2 = {"E 2", "S 2", "W 1"};

        String[] t2_1 = {
                "SOO",
                "OXX",
                "OOO"
        };
        String[] t2_2 = {"E 2", "S 2", "W 1"};

        String[] t3_1 = {
                "OSO",
                "OOO",
                "OXO",
                "OOO"
        };
        String[] t3_2 = {"E 2", "S 3", "W 1"};

        System.out.println(Arrays.toString(jinhyuk.solution(t1_1, t1_2)));
        System.out.println(Arrays.toString(jinhyuk.solution(t2_1, t2_2)));
        System.out.println(Arrays.toString(jinhyuk.solution(t3_1, t3_2)));

    }

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int H = park.length;
        int W = park[0].length();
        int x = 0;
        int y = 0;

        char[][] parkArray = new char[H][W];
        for (int i = 0; i < H; i++) {
            parkArray[i] = park[i].toCharArray();
            for (int j = 0; j < W; j++) {
                if (parkArray[i][j] == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            String[] splitRoute = route.split(" ");
            char direction = splitRoute[0].charAt(0);
            int distance = Integer.parseInt(splitRoute[1]);

            switch (direction) {
                case 'N':
                    if (x - distance < 0) break;
                    for (int i = 1; i <= distance && x - i >= 0; i++) {
                        if (parkArray[x - i][y] == 'X') break;
                        x--;
                    }
                    break;
                case 'S':
                    if (x + distance >= H) break;
                    for (int i = 1; i <= distance && x + i < H; i++) {
                        if (parkArray[x + i][y] == 'X') break;
                        x++;
                    }
                    break;
                case 'W':
                    if (y - distance < 0) break;
                    for (int i = 1; i <= distance && y - i >= 0; i++) {
                        if (parkArray[x][y - i] == 'X') break;
                        y--;
                    }
                    break;
                case 'E':
                    if (y + distance >= W) break;
                    for (int i = 1; i <= distance && y + i < W; i++) {
                        if (parkArray[x][y + i] == 'X') break;
                        y++;
                    }
                    break;
            }
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}
