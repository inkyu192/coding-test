package programmers.introduction.level0;

public class HateEven {

    public int[] solution(int n) {
        int[] answer;
        int index = 0;

        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}
