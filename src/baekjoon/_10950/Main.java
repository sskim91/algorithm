package baekjoon._10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,count;

        count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println(a + b);
        }
        scanner.close();
    }
}
