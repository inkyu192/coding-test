package programmers.level_0.introduction;

import java.util.*;

public class GetMode {

    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        Integer max = Collections.max(map.values());

        int mode = 0;
        int modeCnt = 0;

        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                mode = key;
                modeCnt++;
            }
        }

        if (modeCnt > 1) {
            return -1;
        }

        return mode;
    }
}
