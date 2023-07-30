package programmers.Level1_자연수뒤집어배열로만들기;

/**
 * Created by sskim
 */
public class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();

        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
