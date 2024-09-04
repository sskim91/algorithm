package programmers.Level0_대소문자바꿔서출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(a.length() <= 1 && a.length() >= 20){
            System.err.println("str은 알파벳으로 이루어진 문자열입니다.");
        }

        String[] split = a.split("");
        StringBuilder result = new StringBuilder();
        for (final String s : split) {
            if (Character.isUpperCase(s.charAt(0))) {
                result.append(s.toLowerCase());
            }
            else if (Character.isLowerCase(s.charAt(0))) {
                result.append(s.toUpperCase());
            }
        }
        System.out.println(result);
    }
}
