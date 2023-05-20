package programmers.level_0.introduction;

import java.util.HashMap;
import java.util.Map;

public class LengthOfOverlappingLineSegments {

    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
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
