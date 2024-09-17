package programmers.Level0_숨어있는숫자의덧셈;

class Solution {
    public int solution(String my_string) {

        final char[] charArray = my_string.toCharArray();
        int answer = 0;
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                answer += Integer.parseInt(String.valueOf(c));
            }
        }

        return answer;
    }
}