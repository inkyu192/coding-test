package programmers.practice.level1;

public class FindPrimeNumber {

    public int solution(int n) {
        int answer = 0;
        int[] ints = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            ints[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (ints[i] == 0) continue;

            for (int j = i * 2; j <= n; j += i) {
                ints[j] = 0;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) answer++;
        }

        return answer;
    }
}

