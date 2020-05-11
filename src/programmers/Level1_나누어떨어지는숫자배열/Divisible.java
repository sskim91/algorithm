package programmers.Level1_나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Divisible {
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.

        //처음 매개변수 배열을 담을 list 생성
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<array.length; i++) {
            list.add(array[i]);
        }

        List<Integer> list2 = new ArrayList<>();
        //리스트를 divisor로 나누어 떨어지는 숫자를 넣음
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) % divisor == 0) {
                list2.add(list.get(i));
            }
        }

        int[] ret = new int[list2.size()];

        for (int i=0; i<list2.size(); i++) {
            ret[i] = list2.get(i);
        }

        return ret;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}