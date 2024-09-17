package programmers.Level0_문자리스트를문자열로변환하기;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] arr) {
        return Arrays.stream(arr)
                .map(String::new)
                .collect(Collectors.joining());
    }
}
