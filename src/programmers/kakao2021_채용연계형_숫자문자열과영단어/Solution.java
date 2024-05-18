package programmers.kakao2021_채용연계형_숫자문자열과영단어;

import java.security.interfaces.DSAKey;

/**
 * 1.각 인덱스 값에 해당하는 영단어가 저장되어 있는 영단어 문자열 배열을 구성
 * 2. 영단어 배열을 순회하며 입력 문자열에 등장하는 모든 영단어를 치환한 문자열 생성
 * 3. 변환된 문자열을 정수로 변환한 후 반환
 */
public class Solution {

    private static final String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine"
    };

    public int solution(String s) {
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        new Solution().solution("one4seveneight");
    }
}
