package programmers.Level1_푸드파이트대회;

class Solution {
    public String solution(int[] food) {
        StringBuilder leftSide = new StringBuilder();  // 왼쪽 선수의 음식 배치를 저장할 문자열
        StringBuilder rightSide = new StringBuilder(); // 오른쪽 선수의 음식 배치를 저장할 문자열

        // 각 음식 종류마다 나눠줄 개수를 계산하여 문자열 생성
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;  // 두 선수에게 나눠줄 음식 개수

            // 음식 개수만큼 문자열에 추가
            for (int j = 0; j < count; j++) {
                leftSide.append(i);   // 왼쪽 선수의 문자열에 추가
            }
        }

        // 오른쪽 선수의 문자열은 왼쪽 선수의 문자열을 뒤집은 형태로 생성
        rightSide = new StringBuilder(leftSide).reverse();

        // 최종 결과 문자열: 왼쪽 선수 + 물("0") + 오른쪽 선수
        return leftSide.toString() + "0" + rightSide.toString();
    }

    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        System.out.println(new Solution().solution(food)); // 결과: "1223330333221"
    }
}