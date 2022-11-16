package programmers.practice.level1;

public class DetermineIntegerSquareRoot {

    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);

        if (Math.pow(sqrt, 2) == n) {
            return (long) Math.pow(sqrt + 1, 2);
        }

        return -1;
    }
}
