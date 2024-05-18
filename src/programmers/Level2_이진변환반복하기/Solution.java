package programmers.Level2_이진변환반복하기;

/**
 * 문제풀이 흐름
 * 1. 검사하는 문자열이 "1"이 될때까지 반복
 * A. 문자열에 포함된 0의 개수 세기
 * i. 0의 개수와 제거 횟수 누적
 * B. 나머지 1의 개수를 사용해서 2진법으로 변환하여 1부터 반복
 * 2. 누적된 제거 횟수와 0의 개수를 배열로 반환.
 */
public class Solution {
    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        //s가 "1"이 될 때까지 반복하며 loop, removed 누적
        while (!s.equals("1")) {
            //s변환하며 loop, removed 누적
            int zeros = countZeros(s);
            loop += 1;
            removed += zeros;

            //문자열 s 반환
            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }
        return new int[]{loop, removed};
    }

    private int countZeros(String s) {
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
            }
        }
        return zeros;
    }

}
