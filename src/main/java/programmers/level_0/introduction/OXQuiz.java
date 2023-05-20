package programmers.level_0.introduction;

public class OXQuiz {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            String operator = split[1];
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[2]);
            int z = Integer.parseInt(split[4]);

            if (operator.equals("+")) {
                if (x + y == z) answer[i] = "O";
                else answer[i] = "X";
            } else if (operator.equals("-")) {
                if (x - y == z) answer[i] = "O";
                else answer[i] = "X";
            }
        }

        return answer;
    }
}
