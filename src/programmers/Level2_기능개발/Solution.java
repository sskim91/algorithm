package programmers.Level2_기능개발;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> answer = new ArrayDeque<>();

        int n = progresses.length;
        //1. 각 작업의 배포 가능일 계산
        int[] daysLeft = new int[n];

        for (int i = 0; i < n; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        int count = 0; // 배포될 작업의 수 카운트
        int maxDay = daysLeft[0];   //현재 배포될 작업 중 가장 늦게 배포될 작업의 가능일

        for (int i = 0; i < n; i++) {
            if (daysLeft[i] <= maxDay) {    //배포 가능일이 가장 늦은 배포일보다 빠르면
                count++;
            } else {    //배포 예정일이 기준 배포일보다 느리면
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }

        answer.add(count);  //마지막으로 카운트된 작업들을 함께 배포

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        final int[] solution1 = new Solution().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        final int[] solution2 = new Solution().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
