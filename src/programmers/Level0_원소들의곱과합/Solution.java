package programmers.Level0_원소들의곱과합;

class Solution {
    public int solution(int[] num_list) {

        int multiply = 1;
        int pow = 0;
        for (int i : num_list) {
            multiply *= i;
            pow += i;
        }

        pow = pow * pow;

        if (multiply > pow) {
            return 0;
        }
        else return 1;
    }
}