package baekjoon._2441;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (j >= i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
