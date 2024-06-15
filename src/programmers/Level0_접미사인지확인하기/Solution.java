package programmers.Level0_접미사인지확인하기;

class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.length() < is_suffix.length()) {
            return 0;
        }
        final String substring = my_string.substring(my_string.length() - is_suffix.length());
        if(substring.equals(is_suffix)) return 1;
        else return 0;
    }
}