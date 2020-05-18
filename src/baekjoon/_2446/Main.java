package baekjoon._2446;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j < count * 2; j++) {

                if (j > count * 2 - i) break;

                if ((j >= i) && j <= count * 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= count; i++) {
            for (int j = 1; j < count * 2; j++) {

                if (j > count + i - 1) break;

                if ((j >= count - i + 1) && (j <= count + i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}