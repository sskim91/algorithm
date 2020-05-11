package baekjoon._10953;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str;
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            str = scanner.next().split(",");
            System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
        }
        scanner.close();
    }
}
