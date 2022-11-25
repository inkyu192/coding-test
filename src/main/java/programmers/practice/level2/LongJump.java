package programmers.practice.level2;

public class LongJump {

    public long solution(int n) {
        long[] array = new long[n + 1];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }

        return array[n];
    }
}
