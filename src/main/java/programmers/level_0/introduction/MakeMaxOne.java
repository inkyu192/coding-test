package programmers.level_0.introduction;

import java.util.Arrays;

public class MakeMaxOne {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
