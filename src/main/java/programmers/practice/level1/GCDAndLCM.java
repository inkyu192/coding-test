package programmers.practice.level1;

public class GCDAndLCM {

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;
        int[] answer = {gcd, lcm};

        return answer;
    }

    private int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while (max % min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }

        return min;
    }
}
