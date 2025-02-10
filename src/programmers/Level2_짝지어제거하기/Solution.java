package programmers.Level2_짝지어제거하기;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            // 스택이 비어 있지 않고, 현재 문자와 스택의 맨 위 문자가 같으면
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();    //스택의 맨 위 문자 제거
            } else {
                stack.push(c);  //스택에 현재 문자 추가
            }
        }
        return stack.isEmpty() ? 1 : 0; //스택이 비어 있으면 1, 아니면 0 반환
    }
}