package programmers.practice.level1;

public class GCDAndLCM {

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
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
