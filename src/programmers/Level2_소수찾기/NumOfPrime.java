package programmers.Level2_소수찾기;

class NumOfPrime {
    int numberOfPrime(int n) {
        int result = 0; //소수 개수
        boolean isPrime;
        // 함수를 완성하세요.

        for (int i=2; i<=n; i++) {
            isPrime = true;
            for (int j=2; j<i; j++) {
                if (i % j == 0) { // 소수가 아님
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        NumOfPrime prime = new NumOfPrime();
        System.out.println( prime.numberOfPrime(10) );
    }
}