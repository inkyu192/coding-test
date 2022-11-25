package programmers.practice.level2;

public class NLeastCommonMultiple {

    public int solution(int[] arr) {
        int answer = 1;

        for (int i : arr) {
            answer = lcm(answer, i);
        }

        return answer;
    }

    private int gcd(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int remainder = max % min;

        if (remainder == 0) {
            return min;
        } else {
            return gcd(min, remainder);
        }
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
