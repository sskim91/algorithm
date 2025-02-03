package baekjoon._21918;

import java.util.Scanner;

//https://www.acmicpc.net/submit/21918
public class Main {
    //전구의 개수 N, 명령어의 개수 M
    public static int n, m;
    //전구 상태 배열
    public static int[] arr = new int[4001];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        //전구배열 초기화
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        //각 명령어를 입력 받으며 처리
        for (int i = 0; i < m; i++) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            oper(a, b, c);
        }

        //전구 상태 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void oper(final int a, final int b, final int c) {
        if (a == 1) {   //상태 변경
            arr[b] = c;
        } else if (a == 2) {    //스위치(switch)
            for (int i = b; i <= c; i++) {
                if(arr[i] == 0) arr[i] = 1;
                else arr[i] = 0;
            }
        }   //전구 끄기
        else if (a == 3) {
            for (int i = b; i <= c; i++) {
                arr[i] = 0;
            }
        }   //전구 켜기
        else if (a == 4) {
            for (int i = b; i <= c; i++) {
                arr[i] = 1;
            }
        }
    }
}
