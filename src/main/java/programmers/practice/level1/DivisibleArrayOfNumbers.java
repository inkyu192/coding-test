package programmers.practice.level1;

import java.util.Arrays;

public class DivisibleArrayOfNumbers {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        if (answer.length == 0) return new int[]{-1};

        return answer;
    }
}
