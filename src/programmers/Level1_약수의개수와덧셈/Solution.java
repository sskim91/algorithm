package programmers.Level1_약수의개수와덧셈;

//https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(13, 17)); // 43
        System.out.println(solution.solution(24, 27)); // 52
    }
}
