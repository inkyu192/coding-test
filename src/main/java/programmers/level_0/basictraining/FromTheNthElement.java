package programmers.level_0.basictraining;

import java.util.Arrays;

public class FromTheNthElement {

    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
