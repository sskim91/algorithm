package programmers.Level1_없는숫자더하기;

//https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class Solution {

    public int solution(int[] numbers) {
        int answer = 0;

        int[] allNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (final int allNumber : allNumbers) {
            boolean isExist = false;
            for (final int number : numbers) {
                if (allNumber == number) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                answer += allNumber;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution.solution(numbers)); // 14
    }
}
