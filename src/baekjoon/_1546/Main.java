package baekjoon._1546;

import java.util.Scanner;

/**
 * Created by sskim
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if(A[i] > max) max = A[i];
            sum = sum + A[i];
        }

        //한 과목과 관련된 수식을 총합한 후 관련된 수식으로 변환해 로직이 간단해짐
        System.out.println(sum * 100.0 / max / N);
    }
}
