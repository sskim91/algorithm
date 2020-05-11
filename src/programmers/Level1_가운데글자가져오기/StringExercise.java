package programmers.Level1_가운데글자가져오기;

class StringExercise{
    public String getMiddle(String word){

        int wordLength = word.length();
        String result = "";

        if (wordLength % 2 == 0) {
            result = "" + word.charAt((wordLength / 2) - 1) +word.charAt(wordLength / 2);
        } else {
            result = "" + word.charAt(wordLength / 2);
        }

        return result;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}