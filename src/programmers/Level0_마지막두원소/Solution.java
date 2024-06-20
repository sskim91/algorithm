package programmers.Level0_마지막두원소;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {

        final int last = num_list[num_list.length - 1];
        final int lastBf = num_list[num_list.length - 2];
        int lastNum = 0;

        if (last > lastBf) {
            lastNum = last - lastBf;
        }
        else {
            lastNum = last * 2;
        }

        final ArrayList<Integer> integers = new ArrayList<>();
        for (int i : num_list) {
            integers.add(i);
        }
        integers.add(lastNum);

        return integers.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        final int[] solution = new Solution().solution(new int[]{5, 2, 1, 7, 5});
        System.out.println(Arrays.toString(solution));
    }

}