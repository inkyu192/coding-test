package programmers.introduction.level0;

import java.util.HashMap;
import java.util.Map;

public class LengthOfOverlappingLineSegments {

    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < lines.length; i++) {
            int min = Math.min(lines[i][0], lines[i][1]);
            int max = Math.max(lines[i][0], lines[i][1]);

            for (int j = min; j < max; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int answer = 0;

        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) answer++;
        }

        return answer;
    }
}