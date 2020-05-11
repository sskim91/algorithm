package programmers.Level1_최대값과최소값;

public class GetMinMaxString {
    public String getMinMaxString(String str) {

        String[] strArr = str.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i=0; i<strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int min = 0;
        int max = 0;
        for (int i=0; i<intArr.length; i++) {
            if (min > intArr[i]) {
                min = intArr[i];
            }
            if (max < intArr[i]) {
                max = intArr[i];
            }
        }

        String result = min +" "+ max;

        return result;
    }

    public static void main(String[] args) {
        String str = "100 2 3 15";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}