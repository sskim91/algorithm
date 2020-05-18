package baekjoon._10992;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {  //행
            for (int j = 1; j < count * 2; j++) {   //열

                if(j >= count+i) break; //출력형식 오류 추가

                if (i == count) {
                    System.out.print("*");
                    continue;
                }

                if (j == count - i + 1 || j == count + i - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
