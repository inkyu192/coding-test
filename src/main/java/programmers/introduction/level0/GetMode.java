package programmers.introduction.level0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GetMode {

    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            map.put(num, map.getOrDefault(num, 0) + 1);
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
