package programmers.Level0_이어붙인수;

class Solution {
    public int solution(int[] num_list) {

        StringBuilder oddNum = new StringBuilder();
        StringBuilder evenNum = new StringBuilder();
        for (int i : num_list) {
            if (i % 2 == 0) {
                evenNum.append(i);
            }else{
                oddNum.append(i);
            }
        }
        return Integer.parseInt(oddNum.toString()) + Integer.parseInt(evenNum.toString());
    }
}
