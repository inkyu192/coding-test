package programmers.practice.level1;

public class DetermineIntegerSquareRoot {

    public long solution(long n) {
        int sqrt = (int) Math.sqrt(n);

        if (n == Math.pow(sqrt, 2)) {
            return (long) Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}
