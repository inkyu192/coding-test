package programmers.introduction.level0;

public class CountOfSeven {

    public int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
            while (i > 0) {
                int remainder = i % 10;

                if (remainder == 7) answer++;

                i /= 10;
            }
        }

        return answer;
    }
}
