package programmers.Level1_부족한금액계산하기;

//https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class Solution {
    public long solution(int price, int money, int count) {

        long totalCost = 0;
        for (long i = 1; i <= count; i++) {
            totalCost += price * i;
        }

        long answer = 0;
        if ((money - totalCost) < 0) {
            answer = (money - totalCost) * -1;
        } else if ((money - totalCost) > 0) {
            return 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution.solution(price, money, count)); // Expected output: 10
    }
}

