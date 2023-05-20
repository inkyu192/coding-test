package programmers.level_0.basictraining;

import java.util.Arrays;

public class UpToTheNthElement {

    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOf(num_list, n);
    }
}
