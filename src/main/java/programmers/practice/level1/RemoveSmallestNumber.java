package programmers.practice.level1;

import java.util.Arrays;

public class RemoveSmallestNumber {

    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[index] > arr[i]) index = i;
        }

        int[] answer = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            answer[i] = arr[i];
        }

        for (int i = index + 1; i < arr.length; i++) {
            answer[i - 1] = arr[i];
        }

        return answer;
    }
}
