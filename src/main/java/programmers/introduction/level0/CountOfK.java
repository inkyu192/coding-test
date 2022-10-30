package programmers.introduction.level0;

public class CountOfK {

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            int num = l;

            while (num > 0) {
                int remainder = num % 10;

                if (remainder == k) answer++;

                num /= 10;
            }
        }

        return answer;
    }
}
