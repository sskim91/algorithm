package programmers.Level1_최대공약수와최대공배수;

import java.util.Arrays;

public class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int mod;
        while (min > 0) {
            mod = max % min;
            max = min;
            min = mod;
        }
        answer[0] = max;
        answer[1] = (a*b)/answer[0];

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
