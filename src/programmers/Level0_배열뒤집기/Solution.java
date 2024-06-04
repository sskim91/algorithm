package programmers.Level0_배열뒤집기;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public int[] solution(int[] num_list) {

        int[] temp = new int[num_list.length];
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length ; i++) {
            temp[i] = num_list[num_list.length-1 - i];
        }

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        final int[] solution = new Solution().solution(new int[]{1, 2, 3, 4, 5});
        final int[] solution2 = new Solution().solution(new int[]{1, 1, 1, 1, 1, 2});

        System.out.println("solution = " + solution);
        System.out.println("solution2 = " + solution2);

    }
}
