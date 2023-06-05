package programmers.level_0.basictraining.method;

import java.util.Arrays;

public class FifthFromTheBack {

    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
