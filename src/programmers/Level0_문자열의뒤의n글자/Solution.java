package programmers.Level0_문자열의뒤의n글자;

class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        new Solution().solution("ProgrammerS123", 11);  //grammerS123
        new Solution().solution("He110W0r1d", 5);   //W0r1d
    }
}
