package programmers.Level0_글자이어붙여문자열만들기;

import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] index_list) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < index_list.length; i++) {
            char c = my_string.charAt(index_list[i]);
            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        final String cvsgiorszzzmrpaqpe = new Solution().solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7});
        System.out.println(cvsgiorszzzmrpaqpe);
    }
}