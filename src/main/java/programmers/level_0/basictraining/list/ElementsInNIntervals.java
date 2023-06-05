package programmers.level_0.basictraining.list;

import java.util.ArrayList;
import java.util.List;

public class ElementsInNIntervals {

    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
