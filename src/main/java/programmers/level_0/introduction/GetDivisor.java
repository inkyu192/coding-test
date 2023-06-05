package programmers.level_0.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetDivisor {

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) list.add(n / i);
            }
        }

        Collections.sort(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
