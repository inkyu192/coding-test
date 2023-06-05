package programmers.level_0.basictraining.method;

import java.util.Arrays;

public class FromBackToFifth {

    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOf(num_list, 5);
    }
}
