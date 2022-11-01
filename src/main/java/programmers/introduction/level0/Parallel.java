package programmers.introduction.level0;

import java.util.HashSet;
import java.util.Set;

public class Parallel {

    public int solution(int[][] dots) {
        Set<Double> set = new HashSet<>();

        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double slope = (double) dots[i][0] - dots[j][0] / (double) dots[i][1] - dots[j][1];

                if (set.contains(slope)) {
                    return 1;
                } else {
                    set.add(slope);
                }
            }
        }

        return 0;
    }
}
