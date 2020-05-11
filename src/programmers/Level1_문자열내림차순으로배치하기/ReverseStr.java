package programmers.Level1_문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStr {
    public String reverseStr(String str){

        String[] strArr = str.split("");
        List<String> stringList = Arrays.asList(strArr);
        Collections.reverse(stringList);

        String result = "";

        for (String reverseStr : stringList) {
            result += reverseStr;
        }

        return result;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}