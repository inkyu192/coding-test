package programmers.introduction.level0;

public class SumOfFractions {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum3 = denum1 * num2 + denum2 * num1;
        int num3 = num1 * num2;
        int gcd = gcd(denum3, num3);

        return new int[]{denum3 / gcd, num3 / gcd};
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
