package baekjoon._10952;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        while (scanner.hasNext()) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);
        }
        scanner.close();
    }
}
