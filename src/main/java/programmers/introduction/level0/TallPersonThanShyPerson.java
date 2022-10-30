package programmers.introduction.level0;

public class TallPersonThanShyPerson {

    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i : array) {
            if (i > height) answer++;
        }

        return answer;
    }
}
