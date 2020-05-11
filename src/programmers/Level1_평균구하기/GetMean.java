package programmers.Level1_평균구하기;


public class GetMean {
    public int getMean(int[] array) {

        int count = array.length;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += array[i];
        }

        int avg = sum / count;

        return avg;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}

