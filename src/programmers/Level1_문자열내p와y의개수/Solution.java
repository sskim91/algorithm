package programmers.Level1_문자열내p와y의개수;

/**
 * 1.문자열을 모두 소문자로 변환
 * 2.p의 개수 세기
 * 2-A. 문자열에 등장하는 모든 "p"를 빈 문자열 ""로 치환
 * 2-B. 원본 문자열과 변환된 문자열의 길이 차이가 p의 개수
 */
public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();

        int ps = s.length() - s.replace("p", "").length();
        int ys = s.length() - s.replace("y", "").length();

        return ps == ys;
    }
}
