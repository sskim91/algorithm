package programmers.Level1_직사각형별찍기;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12969
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
