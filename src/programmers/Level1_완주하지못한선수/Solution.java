package programmers.Level1_완주하지못한선수;

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {

        //해시맵 생성
        HashMap<String, Integer> hashMap = new HashMap<>();

        //완주한 선수들의 이름을 해시맵에 저장
        for (String string : completion) {
            hashMap.put(string, hashMap.getOrDefault(string, 0) + 1);
        }

        //참가한 선수들의 이름을 키로 하는 값을 1씩 감소
        for (String string : participant) {
            //완주하지 못한 선수를 찾으면 반환
            if (hashMap.getOrDefault(string, 0) == 0) {
                return string;
            }
            hashMap.put(string, hashMap.get(string) - 1);
        }

        return null;
    }

    public static void main(String[] args) {

        final String solution = new Solution().solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});//leo
        System.out.println("solution = " + solution);
        final String solution2 = new Solution().solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});//mislav
        System.out.println("solution2 = " + solution2);
    }
}
