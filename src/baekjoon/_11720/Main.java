package baekjoon._11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String str = scanner.next();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(str.substring(i, i+1));
        }

        System.out.println(sum);
        scanner.close();
    }
}
