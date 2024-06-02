package programmers.kakao2019_blind_실패율;

import java.util.HashMap;
import java.util.Map;

/**
 * N = 스테이지 개수
 * stages는 1이상 N+1 이하의 자연수
 */
public class Solution {
    public int[] solution(int N, int[] stages) {

        //1. 스테이지별 도전자 수를 구함.
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        //2. 스테이지별 실패한 사용자 수 계산
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        //3. 각 스테이지를 순회하며, 실패율 계산
        for (int i = 0; i < N; i++) {
            if (challenger[i] == 0) {   //4. 도전한 사람이 없는 경우, 실패율은 0
                fails.put(i, 0.);
            }
            else {
                fails.put(i, challenger[i] / total);    //5.실패율 구함
                total -= challenger[i]; //6. 다음 스테이지 실패율을 구하기 위해 현재 스테이지의 인원을 뺌
            }
        }

        //7. 실패율이 높은 스테이지부터 내림차순으로 정렬
        return fails.entrySet().stream()
                .sorted(((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public static void main(String[] args) {
        /**
         * N	stages	result
         * 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
         * 4	[4,4,4,4,4]	[4,1,2,3]
         */
        new Solution().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        new Solution().solution(4, new int[]{4,4,4,4,4});
    }
}
