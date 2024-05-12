package programmers.Level1_3진법뒤집기;

/**
 * 1. 정수를 3진법으로 변환
 * 2. 변환된 문자열 뒤집기
 * 3. 뒤집은 문자열을 정수로 변환
 */
public class Solution {

    public int solution(int n) {
        final String string = Integer.toString(n, 3);
        final String reversed = new StringBuilder(string).reverse().toString();
        return Integer.valueOf(reversed, 3);
    }

    public static void main(String[] args) {
        new Solution().solution(4);
    }
}
