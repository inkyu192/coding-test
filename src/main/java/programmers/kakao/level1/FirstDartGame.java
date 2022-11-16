package programmers.kakao.level1;

public class FirstDartGame {

    public int solution(String dartResult) {
        char[] chars = dartResult.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int[] scores = new int[3];

        for (char ch : chars) {
            if (ch == 'S') {
                scores[index] = (int) Math.pow(Double.parseDouble(sb.toString()), 1);
                index++;
                sb.setLength(0);
            } else if (ch == 'D') {
                scores[index] = (int) Math.pow(Double.parseDouble(sb.toString()), 2);
                index++;
                sb.setLength(0);
            } else if (ch == 'T') {
                scores[index] = (int) Math.pow(Double.parseDouble(sb.toString()), 3);
                index++;
                sb.setLength(0);
            } else if (ch == '*') {
                if (index - 1 != 0) scores[index - 2] *= 2;
                scores[index - 1] *= 2;
            } else if (ch == '#') {
                scores[index - 1] *= -1;
            } else {
                sb.append(ch);
            }
        }

        int answer = 0;

        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}
