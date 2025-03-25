package programmers.Level1_내적;

//https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(solution.solution(a, b)); // Expected output: 3
    }
}
