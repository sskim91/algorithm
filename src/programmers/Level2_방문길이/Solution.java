package programmers.Level2_방문길이;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    private static final HashMap<Character, int[]> location = new HashMap<>();

    public void init() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('R', new int[]{1, 0});
        location.put('L', new int[]{-1, 0});
    }

    public int solution(String dirs) {

        //배열에서 음수 인덱스를 사용할 수 없으니 다른 방법을 생각해야 한다.
        //문제의 핵심은 원점에서 출발해 최종 경로의 길이를 구하는 것.
        //좌표는 방향에 의해서만 제어된다는 점.
        //따라서 원점을 (0,0)에서 (5,5) 로 바꿔 음수 좌표 문제를 해결해도 된다.

        init(); //좌표 이동 초기화

        int x = 5, y = 5;
        HashSet<String> answer = new HashSet<>();

        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            //벗어난 좌표는 인정하지 않음
            if (!isValidMove(nx, ny)) {
                continue;
            }

            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            //좌표를 이동했으므로 업데이트
            x = nx;
            y = ny;
        }
        return answer.size() / 2;
    }

    //좌표평면을 벗어나는지 체크
    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

    public static void main(String[] args) {
        final int solution = new Solution().solution("ULURRDLLU");//7
        final int solution1 = new Solution().solution("LULLLLLLU");//7

        System.out.println("solution = " + solution);
        System.out.println("solution1 = " + solution1);

    }
}
