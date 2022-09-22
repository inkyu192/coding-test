package programmers.practice.level1;

import java.util.Arrays;

public class Average {

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0.0);
    }
}
