package programmers.Level1_두개뽑아서더하기;

import java.util.HashSet;

public class Solution {
    public int[] solution(int[] numbers) {
        //중복을 제거할 HashSet 추가
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                //두 수 더한 값으로 결과를 해시셋에 추가
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
