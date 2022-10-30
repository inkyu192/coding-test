package programmers.introduction.level0;

public class DetermineFinitePrime {

    public int solution(int a, int b) {
        int num = b / gcd(a, b);

        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int remainder = max % min;

        if (remainder == 0) {
            return min;
        } else {
            return gcd(min, remainder);
        }
    }
}
