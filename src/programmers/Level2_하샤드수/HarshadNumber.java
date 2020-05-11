package programmers.Level2_하샤드수;

public class HarshadNumber{
    public boolean isHarshad(int num){

        String convertStr = String.valueOf(num);
        String[] strArr = convertStr.split("");

        int cipher = 0;

        for (int i=0; i<strArr.length; i++) {
            cipher += Integer.parseInt(strArr[i]);
        }

        return num % cipher == 0 ? true : false;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }
}