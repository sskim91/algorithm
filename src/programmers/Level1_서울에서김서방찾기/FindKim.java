package programmers.Level1_서울에서김서방찾기;

import java.util.Arrays;
import java.util.List;

public class FindKim {
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = 0;
        List<String> stringList = Arrays.asList(seoul);
        x = stringList.indexOf("Kim");
        return "김서방은 "+ x + "에 있다";
    }

    // 실행을 위한 테스트코드입니다.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.findKim(names));
    }
}
