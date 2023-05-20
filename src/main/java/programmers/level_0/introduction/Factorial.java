package programmers.level_0.introduction;

public class Factorial {

    public int solution(int n) {
        int answer = 1;

        while (true) {
            int factorial = 1;

            for (int i = answer; i > 0; i--) {
                factorial *= i;
            }

            if (n < factorial) {
                answer--;
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
