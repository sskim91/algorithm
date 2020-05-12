package baekjoon._10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int num;
        int[] intArr = new int[count];
        
        for (int i = 0; i < count; i++) {
            num = scanner.nextInt();
            intArr[i] = num;
        }
        Arrays.sort(intArr);
        scanner.close();
        System.out.println(intArr[0]+" "+intArr[count-1]);
    }
}
