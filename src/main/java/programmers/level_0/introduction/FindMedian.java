package programmers.level_0.introduction;

import java.util.Arrays;

public class FindMedian {

    public int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length / 2];
    }
}
