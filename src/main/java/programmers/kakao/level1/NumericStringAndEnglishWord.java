package programmers.kakao.level1;

public class NumericStringAndEnglishWord {

    public int solution(String s) {
        String[] array = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < array.length; i++) {
            s = s.replaceAll(array[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
