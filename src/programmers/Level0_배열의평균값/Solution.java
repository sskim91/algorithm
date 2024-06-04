package programmers.Level0_배열의평균값;

public class Solution {
    public double solution(int[] numbers) {

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
