package baekjoon._11022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, count, sum;

        count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum = a+b;
            System.out.println("Case #" + i +": "+a+" + "+b+" = "+sum);
        }
        scanner.close();
    }
}
