package programmers.practice.level1;

public class DetermineTheSquareRootOfAnInteger {

    public long solution(long n) {
        Double sqrt = Math.sqrt(n);
        long answer = sqrt == sqrt.intValue() ? (long) Math.pow(sqrt + 1, 2) : -1;

        return answer;
    }
}
