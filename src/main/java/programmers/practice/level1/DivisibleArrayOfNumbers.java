package programmers.practice.level1;

import java.util.Arrays;

public class DivisibleArrayOfNumbers {

    public int[] solution(int[] arr, int divisor) {
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) length++;
        }

        if (length == 0) return new int[]{-1};

        int index = 0;
        int[] answer = new int[length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index++;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}
