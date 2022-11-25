package programmers.hash.level2;

import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {

    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;

        for (Integer integer : map.values()) {
            answer *= integer + 1;
        }

        return answer - 1;
    }
}
