package programmers.Level2_정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class ReverseInt {
    public int reverseInt(int n){

        String[] convertStr = String.valueOf(n).split("");
        Arrays.sort(convertStr, Collections.reverseOrder());


        String str = "";
        for(int i=0; i<convertStr.length; i++) {
            str += convertStr[i];
        }

        return Integer.parseInt(str);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}