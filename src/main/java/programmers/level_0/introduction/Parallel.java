package programmers.level_0.introduction;

import java.util.HashSet;
import java.util.Set;

public class Parallel {

    public int solution(int[][] dots) {
        Set<Double> set = new HashSet<>();

        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double value = (double) (dots[i][0] - dots[j][0]) / (dots[i][1] - dots[j][1]);

                if (set.contains(value)) {
                    return 1;
                } else {
                    set.add(value);
                }
            }
        }
        return 0;
    }
}
