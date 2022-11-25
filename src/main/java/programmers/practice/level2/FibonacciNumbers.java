package programmers.practice.level2;

public class FibonacciNumbers {

    public int solution(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }

        return (int) array[n];
    }
}
