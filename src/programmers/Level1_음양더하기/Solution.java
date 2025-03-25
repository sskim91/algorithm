package programmers.Level1_음양더하기;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {

        //absoultes = 정수배열, signs = 부호배열
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == false) {
                absolutes[i] = -absolutes[i];
            }
        }

        final long sum = Arrays.stream(absolutes)
                .mapToLong(absolute -> absolute)
                .sum();

        return (int) sum;
    }
}
