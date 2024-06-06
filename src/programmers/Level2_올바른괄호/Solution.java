package programmers.Level2_올바른괄호;

import java.util.ArrayDeque;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
            } else {
                if (stack.isEmpty() || stack.pop() == aChar) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //final boolean solution = new Solution().solution("()()");
        //final boolean solution2 = new Solution().solution("(())()");
        final boolean solution3 = new Solution().solution(")()(");
        //final boolean solution4 = new Solution().solution("(()(");

        System.out.println("solution3 = " + solution3);
    }
}
