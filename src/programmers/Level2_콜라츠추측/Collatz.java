package programmers.Level2_콜라츠추측;

import java.util.ArrayList;
import java.util.List;

class Collatz {
    public int collatz(long num) {

        int count = 0;
        int index = 0;

        List<Long> list = new ArrayList<>();
        list.add(num);

        while (count != 500) {

            if(list.get(index) == 1) break;

            if (list.get(index) % 2 == 0) {
                list.add(list.get(index) / 2);
                index++;
                count++;

            } else if (list.get(index) % 2 != 0) {
                list.add((list.get(index) * 3) + 1);
                index++;
                count++;
            }
        }

        return count == 500 ? -1 : count;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 2147349583;
        System.out.println(c.collatz(ex));
    }
}