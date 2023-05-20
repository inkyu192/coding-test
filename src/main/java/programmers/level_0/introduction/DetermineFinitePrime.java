package programmers.level_0.introduction;

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

    // 유클리드 호제법
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
