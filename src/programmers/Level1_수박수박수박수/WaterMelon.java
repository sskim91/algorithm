package programmers.Level1_수박수박수박수;

public class WaterMelon {
    public String watermelon(int n){

        char[] subakStr = new char[n];

        for (int i=0; i<subakStr.length; i++) {
            subakStr[i] = '수';
            if (i % 2 != 0) {
                subakStr[i] = '박';
            }
        }

        return String.valueOf(subakStr);
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}