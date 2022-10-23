package programmers.kakao.level1;

public class FirstDartGame {

    public int solution(String dartResult) {
        int index = 0;
        String temp = "";
        int[] score = {0, 0, 0};

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (c == 'S') {
                score[index] = (int) Math.pow(Double.parseDouble(temp), 1);
                temp = "";
                index++;
            } else if (c == 'D') {
                score[index] = (int) Math.pow(Double.parseDouble(temp), 2);
                temp = "";
                index++;
            } else if (c == 'T') {
                score[index] = (int) Math.pow(Double.parseDouble(temp), 3);
                temp = "";
                index++;
            } else if (c == '*') {
                score[index - 1] *= 2;
                if (index > 1) score[index - 2] *= 2;
            } else if (c == '#') {
                score[index - 1] *= -1;
            } else {
                temp += String.valueOf(c);
            }
        }

        int answer = 0;

        for (int i : score) {
            answer += i;
        }

        return answer;
    }
}
