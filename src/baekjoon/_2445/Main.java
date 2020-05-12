package baekjoon._2445;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
