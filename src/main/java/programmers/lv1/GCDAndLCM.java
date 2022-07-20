package programmers.lv1;

public class GCDAndLCM {

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;
        int[] answer = {gcd, lcm};

        return answer;
    }

    private int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}
