package programmers.lv1;

import java.util.Arrays;

public class RemoveSmallestNumber {

    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = Arrays.stream(arr).filter(num -> num != min).toArray();

        return answer;
    }
}
