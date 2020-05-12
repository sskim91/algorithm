package baekjoon._1924;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(2007, month - 1, day);

        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        String result = "";
        if (dayNum == 1) result = "SUN";
        if (dayNum == 2) result = "MON";
        if (dayNum == 3) result = "TUE";
        if (dayNum == 4) result = "WED";
        if (dayNum == 5) result = "THU";
        if (dayNum == 6) result = "FRI";
        if (dayNum == 7) result = "SAT";

        System.out.println(result);
    }
}
