package programmers.level_0.basictraining.list;

import java.util.ArrayList;
import java.util.List;

public class CreateArray1 {

    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = k; i <= n; i += k) {
            list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
