package programmers.level_0.introduction;

import java.util.Arrays;

public class CutArray {

    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
